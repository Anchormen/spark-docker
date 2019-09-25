FROM apache/zeppelin:0.8.1

RUN wget http://apache.mirror.triple-it.nl/spark/spark-2.4.4/spark-2.4.4-bin-hadoop2.7.tgz \
&&  tar -xzf spark-2.4.4-bin-hadoop2.7.tgz \
&&  mv spark-2.4.4-bin-hadoop2.7 /opt/spark

ENV SPARK_HOME=/opt/spark

EXPOSE 8080