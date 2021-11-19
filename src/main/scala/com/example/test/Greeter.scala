package com.example.test

import org.apache.spark.sql.SparkSession

class Greeter {
  def run(sparkMasterUrl: String, targetFile: String)  = {
    val spark = SparkSession
        .builder()
        .appName("Spark SQL basic example")
        .master(sparkMasterUrl)
        .getOrCreate()
    val df = spark.read.json(targetFile)
    df.show()
    df.printSchema()
    df.select("name").show()
    df.groupBy("age").count().show()
  } 
}
