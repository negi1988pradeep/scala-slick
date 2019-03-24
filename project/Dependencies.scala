import sbt._


object Version {
  val akka = "2.5.20"
  val slick = "3.3.0"
  val postgres = "42.2.5"
  val akkaHttp = "10.1.7"
  val json4s = "3.6.4"
  val akkaHttpJson4s = "1.25.2"
  val logbackClassic = "1.2.3"
}


object Library {
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % Version.akka
  val slick = "com.typesafe.slick" %% "slick" % Version.slick
  val slickHikariCP = "com.typesafe.slick" %% "slick-hikaricp" % Version.slick
  val postgresql = "org.postgresql" % "postgresql" % Version.postgres
  val akkaHttp = "com.typesafe.akka" %% "akka-http" % Version.akkaHttp
  val json4sNative = "org.json4s" %% "json4s-native" % Version.json4s
  val json4sJackson = "org.json4s" %% "json4s-jackson" % Version.json4s
  val akkaHttpJson4s = "de.heikoseeberger" %% "akka-http-json4s" % Version.akkaHttpJson4s
  val logbackClassic = "ch.qos.logback" % "logback-classic" % Version.logbackClassic
}


object Dependencies {

  import Library._

  val depends = Seq(
    akkaActor,
    slick,
    slickHikariCP,
    postgresql,
    akkaHttp,
    json4sNative,
    json4sJackson,
    akkaHttpJson4s,
    logbackClassic
  )

}