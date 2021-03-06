name := """vicenta"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).enablePlugins(DockerPlugin)

unmanagedResourceDirectories in Test <+= baseDirectory ( _ /"target/web/public/test" )

scalaVersion := "2.11.7"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.adrianhurt" %% "play-bootstrap" % "1.1-P25-B3-SNAPSHOT",
  "org.webjars" % "font-awesome" % "4.5.0",
  "org.webjars" % "bootstrap-datepicker" % "1.4.0"
)

fork in run := true


// setting a maintainer which is used for all packaging types</pre>
maintainer:= "Daniel Viorreta"

// exposing the play ports
dockerExposedPorts in Docker := Seq(9000, 9443)
