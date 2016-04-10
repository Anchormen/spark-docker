package nl.anchormen

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by elsioufy on 27-3-16.
  */

object WordCount {

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("wordcount-app").setIfMissing("spark.master", "local[2]")
    val sc = new SparkContext(conf)

    val sentencesArray = Array(
      "this is a sentence",
      "this is another sentence",
      "this is one more sentence",
      "shall it be this or that",
      "i love systems that crash",
      "this is getting really awkward",
      "that is the last sentence")

    val sentencesRdd = sc.parallelize(sentencesArray)

    val wordCounts = sentencesRdd
      .flatMap(sentence => sentence.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_+_)
      .collect()

    wordCounts.foreach(println)

  }

}