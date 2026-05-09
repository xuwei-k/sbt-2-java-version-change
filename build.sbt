scalaVersion := "2.13.18"

lazy val a = project
lazy val b = project.dependsOn(a)
