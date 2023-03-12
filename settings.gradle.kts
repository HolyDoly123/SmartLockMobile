pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "SmartLock"
include (":app")
include(":common:core")
include(":common:network")
include(":common:database")
include(":common:ui")
include(":common:bluetooth")
include(":common:utils")
include(":feature:auth")
include(":feature:main")
include(":feature:statistics")
