name := "shapes-oo-scala"

version := "0.2" //previously 0.0.1.  Change back if we run into problems

scalaVersion := "2.12.1" //previously 2.11.8.  Change back if we run into problems

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-language:higherKinds", "-Ypartial-unification")

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % Test,
  "org.scalacheck" %% "scalacheck" % "1.12.6" % Test,
  "com.slamdata" %% "matryoshka-core" % "0.17.0",
  "com.slamdata" %% "matryoshka-scalacheck" % "0.17.0" % Test,
  "org.scalaz"     %% "scalaz-core"           % "7.2.9"
)
