plugins {
  kotlin("jvm") version "2.0.0"
  id("me.champeau.jmh") version "0.7.2"
  id("io.freefair.lombok") version "8.6"
}

group = "com.github.albertosh"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

kotlin {
  jvmToolchain(21)
}

jmh {
  iterations = 20
  timeOnIteration = "5s"
  benchmarkMode = listOf("thrpt", "avgt")
  fork = 2
  resultsFile = layout.buildDirectory.file("reports/jmh/results.txt")
  timeUnit = "ns"
  warmup = "5s"
  warmupIterations = 2
}
