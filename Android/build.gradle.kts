buildscript {
    // make sure I need it
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.DI.HILT}")
    }
}
plugins {
    id("com.android.application") version Versions.ANDROID apply false
    // for Compose (The Compose 1.3.1 required Kotlin 1.7.10
    id("com.android.library") version Versions.ANDROID apply false
    id("org.jetbrains.kotlin.android") version Versions.KOTLIN apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}