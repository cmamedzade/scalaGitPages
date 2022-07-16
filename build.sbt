ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

//enablePlugins(GhpagesPlugin)

//git.remoteRepo := "git@github.com:{your username}/{your project}.git"

lazy val root = (project in file("."))
  .settings(
    name := "scalaDoc"
  )
