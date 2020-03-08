name := "property-based-testing-workshop"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.0" % "test",
  "org.scalatestplus" %% "scalacheck-1-14" % "3.1.0.0" % Test,
  "com.github.chocpanda" %% "scalacheck-magnolia" % "0.3.1"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:existentials",
  "-language:postfixOps",
  "-unchecked",
  "-Ywarn-value-discard"
)