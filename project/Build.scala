import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "jeremyfox"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,

      "org.scala-tools" %% "scala-stm" % "0.3"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
