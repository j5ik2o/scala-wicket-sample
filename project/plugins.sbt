logLevel := Level.Warn

resolvers += "Flyway" at "http://flywaydb.org/repo"

addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "1.1.0")

addSbtPlugin("org.flywaydb" % "flyway-sbt" % "3.2.1")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.0")

