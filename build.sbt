
val spark = "org.apache.spark" %% "spark-sql" % "2.2.1"

ThisBuild / scalaVersion := "2.11.8"
ThisBuild / organization := "com.rxcorp.da"

lazy val root = (project in file("."))
  .settings(
    name := "samplesparkapp",
    version := "1.0.0-SNAPSHOT",
    publishMavenStyle := true,
    libraryDependencies ++= Seq(spark),
    assemblyMergeStrategy in assembly := {
      case PathList("META-INF", xs@_*) => MergeStrategy.discard
      case x => MergeStrategy.first
    }
  )