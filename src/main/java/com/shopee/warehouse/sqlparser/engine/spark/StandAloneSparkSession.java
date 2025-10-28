package com.shopee.warehouse.sqlparser.engine.spark;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLStreamHandlerFactory;


@Component
public class StandAloneSparkSession implements InitializingBean {

    private SparkSession session;

    @Bean(name = "SparkSession")
    public SparkSession getSparkSession() {
        return session.cloneSession();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        addFsUrlStreamHandlerFactory();

        SparkConf sparkConf = new SparkConf();
        sparkConf.set("spark.ui.enabled", "false")
                 .set("spark.driver.host", "127.0.0.1")
                 .set("spark.executor.memory", "4g")
                 .set("spark.driver.memory", "2g")
                 .set("spark.ui.heapHistogramEnabled", "false")
                 .set("spark.executor.heartbeatInterval", "1000s")
                 .set("spark.network.timeout", "10001s")
                 .set("spark.sql.hive.metastore.version", "2.3.9")
                 .set("spark.sql.hive.thriftServer.singleSession", "true")
                 .set("spark.sql.hive.metastore.jars", "path")
                 .set("spark.sql.storeAssignmentPolicy", "LEGACY")
                .set("spark.driver.userClassPathFirst", "true")
                .set("spark.executor.userClassPathFirst", "true")
                .set("spark.sql.hive.convertMetastoreOrc", "false");


        if (StringUtils.isNotEmpty(System.getProperty("hive.dir"))) {
            sparkConf.set("spark.hadoop.hive.config.resources", System.getProperty("hive.dir") + "/hive-site.xml");
            Configuration hadoopConf = new Configuration();
            hadoopConf.addResource(new org.apache.hadoop.fs.Path("file:///etc/hadoop-client/core-site.xml"));
            hadoopConf.addResource(new org.apache.hadoop.fs.Path("file:///etc/hadoop-client/hdfs-site.xml"));

            hadoopConf.iterator().forEachRemaining(k -> {
                sparkConf.set("spark.hadoop." + k.getKey(), k.getValue());
            });
        }

        session = SparkSession.builder()
                .config(sparkConf)
                .master("local[4]")
                .enableHiveSupport()
                .config("spark.hive.exec.dynamic.partition", "true")
                .config("spark.hive.exec.dynamic.partition.mode", "nonstrict")
                .config("spark.sql.catalogImplementation", "hive")
                .getOrCreate();

//        session.sparkContext().hadoopConfiguration().set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");
//        session.sparkContext().hadoopConfiguration().set("fs.file.impl", "org.apache.hadoop.fs.LocalFileSystem");
        session.sparkContext().hadoopConfiguration().set("dfs.client.datanode-restart.timeout", "30000");
        session.sparkContext().hadoopConfiguration().set("hadoop.service.shutdown.timeout", "30000");
        session.sparkContext().hadoopConfiguration().set("dfs.namenode.decommission.interval", "30000");
        session.sql("show tables").show();
    }

    private void addFsUrlStreamHandlerFactory() throws Exception{
        Field factoryField = URL.class.getDeclaredField("factory");
        factoryField.setAccessible(true);
        URLStreamHandlerFactory urlStreamHandlerFactory
                = (URLStreamHandlerFactory) factoryField.get(null);
        if (urlStreamHandlerFactory == null) {
            URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
        } else {
            Field lockField = URL.class.getDeclaredField("streamHandlerLock");
            lockField.setAccessible(true);
            synchronized (lockField.get(null)) {
                factoryField.set(null, null);
                URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
            }
        }
    }
}
