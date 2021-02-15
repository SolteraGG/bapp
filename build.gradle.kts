plugins {
    java
    kotlin("jvm") version "1.4.30"
}

allprojects {
    // register repositories
    repositories {
        mavenCentral()
    }
}

subprojects {
    // apply pluginsto subprojects
    apply(plugin = "java")
    apply(plugin = "kotlin")
}
