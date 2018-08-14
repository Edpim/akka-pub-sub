name := "akka-pub-sub"

version := "1.0"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.13"
lazy val akkaHttpVersion = "10.1.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "org.scalamock" %% "scalamock-scalatest-support" % "3.6.0" % Test
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
  "ch.megard" %% "akka-http-cors" % "0.3.0")

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.6.9",
  "com.eclipsesource" %% "play-json-schema-validator" % "0.9.4",
  "de.heikoseeberger" %% "akka-http-play-json" % "1.21.0")