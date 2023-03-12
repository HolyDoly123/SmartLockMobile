plugins {
    `kotlin-dsl`
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplicationCompose") {
            id = "ru.rudakov.smartlock.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("androidApplication") {
            id = "ru.rudakov.smartlock.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidLibraryCompose") {
            id = "ru.rudakov.smartlock.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("androidLibrary") {
            id = "ru.rudakov.smartlock.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidFeature") {
            id = "ru.rudakov.smartlock.feature"
            implementationClass = "AndroidFeatureConventionPlugin"
        }
        register("androidDagger") {
            id = "ru.rudakov.smartlock.dagger2"
            implementationClass = "AndroidDagger2ConventionPlugin"
        }
        register("androidRoom") {
            id = "ru.rudakov.smartlock.room"
            implementationClass = "AndroidRoomConventionPlugin"
        }
    }
}