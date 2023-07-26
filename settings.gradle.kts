plugins {
    id("com.gradle.enterprise") version "3.14.1"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.6.0"
}

rootProject.name = "gradle-build-scan-quickstart"

gradleEnterprise {
    buildScan {
        server = "<<your Gradle Enterprise instance>>"
        publishAlways()
    }
}
