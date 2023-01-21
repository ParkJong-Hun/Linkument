plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    // make sure I need it
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt") // FIXME: change to ksp
}

android {
    compileSdk = Versions.CompileSdk

    defaultConfig {
        applicationId = "com.pjh.linkument_android_app"
        minSdk = Versions.MinSdk
        targetSdk = Versions.TargetSdk
        versionCode = Versions.VersionCode
        versionName = Versions.VersionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        // for Hilt (The Hilt using JAVA 8)
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.Compose.Compose
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    defaultDependencies()
    composeDependencies()
    materialDesign()
    // make sure I need it
    di()
    retrofit()
}
kapt {
    correctErrorTypes = true
}