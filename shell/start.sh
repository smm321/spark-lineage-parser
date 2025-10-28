#!/bin/bash
NLS_LANG=AMERICAN_AMERICA.ZHS16GBK
LANG=zh_CN.UTF-8
export HADOOP_CONF_DIR=/etc/hadoop-client
export LOG_DIR=`pwd`
pid=`ps -ef|grep sql-parser-0.0.1-SNAPSHOT.jar|grep -v grep| grep -v sql-parser-0.0.1-SNAPSHOT-jar-with-dependencies.jar | awk '{print $2}'`
if [ $pid ]; then echo "sql-parser already running..., start failed "
                  exit 1
fi
mv nohup.out nohup.out.bk
nohup java -Xmx6g -agentlib:jdwp=transport=dt_socket,server=y,address=16000,suspend=n \
      -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=$LOG_DIR/dump \
      -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -Xloggc:$LOG_DIR/gc.log  \
      -XX:ErrorFile=$LOG_DIR/dump.hs_err_pid%p.log \
      -XX:OnError="jstack %p > $LOG_DIR/dump/threaddump.%p.txt; kill -9 %p" \
      -XX:OnOutOfMemoryError="jmap -dump:format=b,file=$LOG_DIR/dump/heapdump.%p.hprof %p; kill -9 %p" \
      -XX:+UnlockDiagnosticVMOptions -XX:+LogVMOutput -XX:LogFile=$LOG_DIR/dump/jvm.log \
      -Dsun.java.command=sql-parser \
      -Dctalk.url=https://openapi.seatalk.io/webhook/group/KcXQVqb4TcGo2w91G__wuA \
      -Dsquid.host=dbp-squid-nonlive.mdw.seabanksvc.com -Dsquid.port=3128 \
      -Dtopic=dwh-message \
      -Dspring.kafka.bootstrap-servers=id-corebank-kafka-1-uat1.mdw.seabanksvc.com:9092,id-corebank-kafka-2-uat1.mdw.seabanksvc.com:9092 \
      -DmetadataUrl=http://id-warehouse-data-assets-uat1-int.biz.seabanksvc.com:15000/api/metaData/dependency/lineageCollect \
      -Djdbc_url=amRiYzpteXNxbDovL2lkLWNvcmViYW5rLW1hc3Rlci0wMC11YXQxLmRiLnNlYWJhbmtzdmMuY29tOjY2MDYvaWRfYmtlX2RhdGFfd2FyZWhvdXNlX2RiP2NoYXJhY3RlckVuY29kaW5nPVVURi04JnVzZVVuaWNvZGU9dHJ1ZSZ1c2VTU0w9ZmFsc2Umc2VydmVyVGltZXpvbmU9R01UJTJCNyZhbGxvd1B1YmxpY0tleVJldHJpZXZhbD10cnVl \
      -Duser_name=npt_app \
      -Dpassword=cXFKMUlSQTBBWjNJNDFfSkNLR1c=  -jar ./sql-parser-0.0.1-SNAPSHOT.jar &
sleep 5

pid=`ps -ef|grep sql-parser-0.0.1-SNAPSHOT.jar|grep -v grep| grep -v sql-parser-0.0.1-SNAPSHOT-jar-with-dependencies.jar |awk '{print $2}'`
if [ ! $pid ]; then echo "start failed "
else echo "start success "
fi
exit 1