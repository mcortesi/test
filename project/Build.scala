import sbt._
import sbt.Keys._

object ApplicationBuild extends Build {


 lazy val root = Project(
   id = "pepe",
   base = file("."),
   settings = Project.defaultSettings ++ Seq(
     name := "pepe",
     organization := "ar.com.cono",
     version := "0.2.1",
     scalaVersion := "2.10.0",
     scalacOptions := Seq("-deprecation", "-feature"),
     licenses      := ("Apache2", new java.net.URL("http://www.apache.org/licenses/LICENSE-2.0.txt")) :: Nil,
     libraryDependencies ++= Seq(
      "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test",
      "org.scala-lang" % "scala-compiler" % "2.10.0",
      "com.twitter" % "finatra" % "1.3.1"
     ),
     resolvers ++= Seq(
        "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
        "OSS SonarType" at "https://oss.sonatype.org/content/groups/public/",
        "Twitter repository" at "http://maven.twttr.com/"
     )

     // add other settings here
   )
 )
}
