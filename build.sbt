name := "spark-sandbox"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= {
  val sparkVersion = "2.3.0"
//  val akkaHttpVersion = "10.0.5"
//  val akkaVersion = "2.4.18"
  Seq(
    "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-streaming" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
    "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion
    //"org.apache.avro" % "avro" % "1.8.1",
//    "com.twitter" %% "bijection-avro" % "0.9.2",
//    "com.sksamuel.avro4s" %% "avro4s-core" % "1.8.0",
//    //"io.confluent" % "kafka-avro-serializer" % "3.0.0"
//    //"com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0", // https://github.com/datastax/spark-cassandra-connector
//    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
//    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
//    "com.datastax.cassandra" % "dse-driver" % "1.1.2",
//    //"org.redisson" % "redisson" % "2.10.4",
//    "net.debasishg" %% "redisclient" % "3.4",
//    //    "org.asynchttpclient" % "async-http-client" % "2.0.35",
//    //    "com.google.code.gson" % "gson" % "1.7.1"
//    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
//    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
//    "com.typesafe.akka" %% "akka-stream-kafka" % "0.17",
//    "com.typesafe.akka" % "akka-stream-testkit-experimental_2.11" % "2.0.5" % "test",
//    "com.github.scopt" %% "scopt" % "3.7.0"

  )
}