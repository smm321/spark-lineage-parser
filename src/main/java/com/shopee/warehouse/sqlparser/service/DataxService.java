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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Map;

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
                if (!report.getErrMsg().contains("Check slave behind execute error")) {
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
                }

                pst.setString(12, "1");
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

    public void sendCtalk(String url, Map request) {
        try {
            restProxyTemplate.getRestTemplate().postForObject(url, JSONObject.toJSONString(request), String.class);
        } catch (Exception ignored) {}
    }
}
