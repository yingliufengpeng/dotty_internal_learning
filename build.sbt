lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty_internals-learning",
    version := "0.1.0",

    scalaVersion := "0.23.0-RC1",

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
    
    
  )

// https://mvnrepository.com/artifact/ch.epfl.lamp/dotty-compiler_0.23
libraryDependencies += "ch.epfl.lamp" % "dotty-compiler_0.23" % "0.23.0-bin-20200316-6948038-NIGHTLY"
//Compile / resourceDirectory := baseDirectory.value / "src/main/resources"
