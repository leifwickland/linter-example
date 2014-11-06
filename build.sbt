scalaVersion := "2.11.4"

resolvers += "linter" at "http://hairyfotr.github.io/linteRepo/releases"

addCompilerPlugin("com.foursquare.lint" % "linter_2.11" % "0.1-SNAPSHOT")

