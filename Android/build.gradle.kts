buildscript {
    // make sure I need it
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.DI.Hilt}")
    }
}
plugins {
    id("com.android.application") version Versions.Android apply false
    // for Compose (The Compose 1.3.1 required Kotlin 1.7.10
    id("com.android.library") version Versions.Android apply false
    id("org.jetbrains.kotlin.android") version Versions.Kotlin apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}