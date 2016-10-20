
lazy val commonSettings = Seq(
  organization := "com.waywardcode",
  version := "1.0",
  scalaVersion := "2.12.0-RC2",  
  scalacOptions := Seq("-opt:l:classpath")
)


lazy val lib = (project in file("lib")).
  settings(commonSettings: _*).
  settings(
    name := "spritz"
  )
  
lazy val cmd = (project in file("cmd")).
  settings(commonSettings: _*).
  settings(
    name := "spritz_cmd"
  ).
  dependsOn(lib)

// lazy val notes = (project in file("notes")).
//   settings(commonSettings: _*).
//   settings(
//     name := "spritz_notes"
//     libraryDependencies ++= Seq("com.atlassian.commonmark" %%
//                                 "commonmark" %%
// 				"0.6.0")
//   ).
//   dependsOn(lib)
