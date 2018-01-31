FROM apache/zeppelin:0.7.3

RUN wget http://apache.mirror.triple-it.nl/spark/spark-2.2.1/spark-2.2.1-bin-hadoop2.7.tgz \
&&  tar -xzf spark-2.2.1-bin-hadoop2.7.tgz \
&&  mv spark-2.2.1-bin-hadoop2.7 /opt/spark

ENV SPARK_HOME=/opt/spark

