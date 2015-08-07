name := "lucenecal"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "org.apache.lucene" % "lucene-core" % "5.2.1",
  "org.apache.lucene" % "lucene-analyzers-common" % "5.2.1",
  "org.scalaj" %% "scalaj-http" % "1.1.5",
  "org.apache.lucene" % "lucene-queryparser" % "5.2.1"
)

