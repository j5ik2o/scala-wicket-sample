val wicketVersion = "6.19.0"

val tomcatVersion = "7.0.53"

lazy val commonSettings = Seq(
  organization := "com.github.j5ik2o",
  scalaVersion := "2.11.6",
  resolvers ++= Seq(
    "Sonatype OSS Release Repository" at "https://oss.sonatype.org/content/repositories/releases/"
  ),
  libraryDependencies ++= Seq(
    "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
    "org.slf4j" % "slf4j-log4j12" % "1.6.4",
    "org.sisioh" %% "baseunits-scala" % "0.1.17"
  )
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .aggregate(application, domain, infrastructure)

lazy val tomcatDependencies = Seq(
  "org.apache.tomcat.embed" % "tomcat-embed-core" % tomcatVersion % "container",
  "org.apache.tomcat.embed" % "tomcat-embed-logging-juli" % tomcatVersion % "container",
  "org.apache.tomcat.embed" % "tomcat-embed-jasper" % tomcatVersion % "container",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided",
  "javax.servlet" % "jstl" % "1.2"
)

lazy val application = project
  .settings(commonSettings: _*)
  .settings(com.earldouglas.xwp.XwpPlugin.tomcat(): _*)
  .settings(flywaySettings: _*)
  .settings(
    name := "scala-wicket-application",
    resourceDirectory in Compile <<= baseDirectory(_ / "src/main/resources"),
    libraryDependencies ++= Seq(
      "org.apache.wicket" % "wicket-core" % wicketVersion withSources(),
      "org.apache.wicket" % "wicket-util" % wicketVersion withSources(),
      "org.apache.wicket" % "wicket-datetime" % wicketVersion withSources(),
      "org.apache.wicket" % "wicket-extensions" % wicketVersion withSources(),
      "org.apache.wicket" % "wicket-auth-roles" % wicketVersion withSources(),
      "de.agilecoders.wicket" % "wicket-bootstrap-core" % "0.9.7" withSources(),
      "de.agilecoders.wicket" % "wicket-bootstrap-extensions" % "0.9.7" withSources(),
      "de.agilecoders.wicket" % "wicket-bootstrap-themes" % "0.9.7" withSources(),
      "com.h2database" % "h2" % "1.3.174"
    ) ++ tomcatDependencies,
    flywayUrl := "jdbc:h2:file:target/foobar",
    flywayUser := "SA"
  ).dependsOn(domain, infrastructure)

lazy val domain = project
  .settings(commonSettings: _*)
  .settings(
    name := "scala-wicket-domain",
    libraryDependencies ++= Seq(
      "org.sisioh" %% "scala-dddbase" % "0.2.7"
    )
  ).dependsOn(infrastructure)

lazy val infrastructure = project
  .settings(commonSettings: _*)
  .settings(
    name := "scala-wicket-infrastructure"
  )
