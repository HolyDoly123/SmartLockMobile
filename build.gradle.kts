buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false

    id ("com.github.ben-manes.versions") version "0.41.0"
    id ("nl.littlerobots.version-catalog-update") version "0.7.0"
}

versionCatalogUpdate {
    keep {
        val keepUnusedVersions = true
    }
}