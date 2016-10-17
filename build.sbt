name := "finatra-hello"
moduleName := "finatra-hello"
version := "1.0.0"

fork in run := true
scalaVersion := "2.11.8"

lazy val versions = new {
  val finatra = "2.5.0"
}

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % versions.finatra % "compile"
)

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Twitter Maven" at "https://maven.twttr.com"
)
