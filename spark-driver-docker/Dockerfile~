FROM anchormen/spark

COPY app.jar /opt/app.jar

CMD /opt/spark/bin/spark-submit --class $SPARK_CLASS --master spark://master:7077 /opt/app.jar
