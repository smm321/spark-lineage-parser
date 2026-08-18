package com.shopee.warehouse.sqlparser.service;

import com.alibaba.fastjson.JSONObject;
import com.shopee.warehouse.sqlparser.config.RestProxyTemplate;
import com.shopee.warehouse.sqlparser.pojo.IngestionReport;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
public class DataxService {
    private static final Logger logger = LoggerFactory.getLogger(DataxService.class);
    private static final String url;
    private static final String psw;
    static {
        url = new String(Base64.getDecoder().decode(System.getProperty("jdbc_url", "")));
        psw = new String(Base64.getDecoder().decode(System.getProperty("password","")));
        logger.info("url {}", url);
        logger.info("psw {}", System.getProperty("password"));
    }

    @Value("${datax.ctalk.url:https://openapi.seatalk.io/webhook/group/KcXQVqb4TcGo2w91G__wuA}")
    private String ctalk;

    @Autowired
    private RestProxyTemplate restProxyTemplate;

    // 幂等控制：存储告警记录，key为 taskId|batchDate|errMsg，value为时间戳
    private final ConcurrentHashMap<String, Long> alertCache = new ConcurrentHashMap<>();
    
    // 告警去重时间窗口：1小时（毫秒）
    private static final long ALERT_DEDUP_WINDOW_MS = 5 * 60 * 60 * 1000L;
    
    // 定时清理过期记录的调度器
    private final ScheduledExecutorService cleanupScheduler = Executors.newSingleThreadScheduledExecutor(r -> {
        Thread t = new Thread(r, "DataxService-AlertCache-Cleanup");
        t.setDaemon(true);
        return t;
    });

    public DataxService() {
        // 启动定时清理任务，每30分钟清理一次过期记录
        cleanupScheduler.scheduleAtFixedRate(this::cleanupExpiredAlerts, 30, 30, TimeUnit.MINUTES);
    }

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.setLoginTimeout(10);
        return DriverManager.getConnection(url, System.getProperty("user_name"), psw);
    }

    public void logDatax(IngestionReport report) {
        logger.debug(String.format("DataxService receive request %s", report.toString()));
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = getConnection();
            pst = con.prepareStatement("insert into datax_execution_log (dag_name, task_name, job_name, logical_db_name, logical_table_name, app_id, env, job_info, metric_info,batch_date, err_msg, status) values(?,?,?, ?,?,?, ?,?,?, ?,?, ?)");

            pst.setString(1, report.getDagId());
            pst.setString(2, report.getTaskId());
            pst.setString(3, report.getJobName());
            pst.setString(4, report.getDbName());
            pst.setString(5, report.getTableName());
            pst.setString(6, report.getAppId());
            pst.setString(7, report.getEnv());
            pst.setString(8, JSONObject.toJSONString(report.getJobInfo()));
            pst.setString(9, JSONObject.toJSONString(report.getMetricInfo()));
            pst.setString(10, report.getBatchDate());
            pst.setString(11, report.getErrMsg());
            if (StringUtils.isEmpty(report.getErrMsg())) {
                pst.setString(12, "0");
            } else {
                pst.setString(12, "1");
                // 幂等控制：检查是否在1小时内已发送过相同告警
                if (shouldSendAlert(report)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[").append(report.getEnv()).append("] ").append(report.getTaskId()).append(" Error :");
                    String msg = report.getErrMsg();
                    if (msg.length() > 128) {
                        msg = msg.substring(0, 128);
                    }
                    sb.append(msg);
                    JSONObject content = new JSONObject();
                    content.put("content", sb.toString());
                    if(StringUtils.isNotEmpty(report.getReceiver())) {
                        content.put("mentioned_email_list", report.getReceiver().split(";"));
                    }

                    JSONObject request = new JSONObject();
                    request.put("tag", "text");
                    request.put("text", content);

                    sendCtalk(ctalk, request);
                } else {
                    logger.debug("Alert deduplicated: taskId={}, batchDate={}, errMsg={}",
                            report.getTaskId(), report.getBatchDate(), report.getErrMsg());
                }
            }
            pst.executeUpdate();
        } catch (Exception e) {
            logger.error("save datax execution log error ", e);
        } finally {
            if (null != pst) {
                try {
                    pst.close();
                } catch (SQLException ignored) {
                }
            }
            if (null != con) {
                try {
                    con.close();
                } catch (SQLException ignored) {
                }
            }
        }
    }

    public void sendCtalk(String url, Map<String, Object> request) {
        try {
            restProxyTemplate.getRestTemplate().postForObject(url, JSONObject.toJSONString(request), String.class);
        } catch (Exception ignored) {}
    }

    /**
     * 幂等控制：判断是否应该发送告警
     * 基于 taskId、batchDate、errMsg 三个字段组合作为唯一标识
     * 1小时内相同告警只发送一次
     * 
     * @param report 告警报告
     * @return true 表示应该发送，false 表示在1小时内已发送过，需要去重
     */
    private boolean shouldSendAlert(IngestionReport report) {
        String taskId = StringUtils.defaultString(report.getTaskId(), "");
        String batchDate = StringUtils.defaultString(report.getBatchDate(), "");

        // 生成唯一key：taskId|batchDate|errMsgHash
        String alertKey = taskId + "|" + batchDate;
        
        long currentTime = System.currentTimeMillis();
        
        // 检查缓存中是否存在该告警记录
        Long lastSentTime = alertCache.get(alertKey);
        
        if (lastSentTime != null) {
            // 如果存在记录，检查是否在1小时窗口内
            long timeDiff = currentTime - lastSentTime;
            if (timeDiff < ALERT_DEDUP_WINDOW_MS) {
                // 在5小时内，不需要重复发送
                return false;
            }
        }
        
        // 更新或添加记录
        alertCache.put(alertKey, currentTime);
        return true;
    }

    /**
     * 对字符串进行 MD5 hash 处理
     * 用于将长字符串转换为固定长度的 hash 值，节省内存
     * 
     * @param input 输入字符串
     * @return MD5 hash 值的十六进制字符串（32位）
     */
    private String hashString(String input) {
        if (StringUtils.isEmpty(input)) {
            return "";
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            // MD5 算法应该总是可用，如果不可用则使用 hashCode 作为降级方案
            logger.warn("MD5 algorithm not available, using hashCode as fallback", e);
            return String.valueOf(input.hashCode());
        }
    }

    /**
     * 将字节数组转换为十六进制字符串
     * Java 8 兼容的实现方式
     * 
     * @param bytes 字节数组
     * @return 十六进制字符串
     */
    private String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int v = bytes[i] & 0xFF;
            hexChars[i * 2] = HEX_ARRAY[v >>> 4];
            hexChars[i * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    // 十六进制字符数组，用于字节转十六进制
    private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    /**
     * 清理过期的告警记录（超过1小时的记录）
     * 定期执行，避免内存泄漏
     */
    private void cleanupExpiredAlerts() {
        try {
            long currentTime = System.currentTimeMillis();
            alertCache.entrySet().removeIf(entry -> {
                long timeDiff = currentTime - entry.getValue();
                return timeDiff >= ALERT_DEDUP_WINDOW_MS;
            });
            logger.debug("Cleaned up expired alert cache entries, remaining size: {}", alertCache.size());
        } catch (Exception e) {
            logger.error("Error cleaning up expired alerts", e);
        }
    }
}
