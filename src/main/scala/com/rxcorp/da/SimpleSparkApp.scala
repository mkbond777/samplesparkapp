package com.rxcorp.da

import org.apache.spark.sql.SparkSession

/**
  * Created by DT2 on 2019-08-20.
  */
object SimpleSparkApp extends App {


    val spark = SparkSession
      .builder()
      .appName("Spark SQL basic example")
      .getOrCreate()

    import spark.implicits._

    val df = Seq((1,"12-03-2019",23),(1,"13-03-2019",25),(1,"14-03-2019",26),(2,"12-03-2019",23),
        (2,"13-03-2019",25),(2,"14-03-2019",26),(2,"15-03-2019",29)).toDF("id","date","value")

    df.show()

    /**
    spark-submit --master local --class com.rxcorp.da.SimpleSparkApp /Users/m
    .kumar/Documents/projects/samplesparkapp/target/scala-2.11/samplesparkapp_2.11-1.0.0-SNAPSHOT.jar /Users/m
    .kumar/Documents/projects/samplesparkapp/src/main/resources/people.json
     */

}
