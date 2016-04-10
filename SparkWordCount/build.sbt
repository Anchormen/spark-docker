
Seq(
  organization	:= "nl.anchormen",
  version 	:= "0.0.1-SNAPSHOT",
  scalaVersion 	:= "2.10.6",
  crossPaths 	:= false
)

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.6.1" % "provided"