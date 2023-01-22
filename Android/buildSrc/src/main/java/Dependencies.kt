object Dependencies {
    object Default {
        const val Core = "androidx.core:core-ktx:${Versions.Default.Core}"
        const val Junit = "junit:junit:${Versions.Default.Junit}"
        const val LifeCycleRuntime =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.Default.LifeCycle}"
        const val LifeCycleRuntimeCompose =
            "androidx.lifecycle:lifecycle-runtime-compose:${Versions.Default.LifeCycle}"
        const val LifeCycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.Default.LifeCycle}"
        const val ActivityCompose =
            "androidx.activity:activity-compose:${Versions.Default.ActivityCompose}"
        const val ExtJunit = "androidx.test.ext:junit:${Versions.Default.ExtJunit}"
        const val EspressoCore =
            "androidx.test.espresso:espresso-core:${Versions.Default.EspressoCore}"
    }

    object Compose {
        const val Ui = "androidx.compose.ui:ui:${Versions.Compose.Compose}"
        const val UiToolingPreview =
            "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.Compose}"
        const val UiTooling = "androidx.compose.ui:ui-tooling:${Versions.Compose.Compose}"
        const val UiJunit = "androidx.compose.ui:ui-test-junit4:${Versions.Compose.Compose}"
        const val Foundation = "androidx.compose.foundation:foundation:${Versions.Compose.Compose}"
        const val RuntimeLiveData =
            "androidx.compose.runtime:runtime-livedata:${Versions.Compose.Compose}"
        const val ConstraintLayout =
            "androidx.constraintlayout:constraintlayout-compose:${Versions.Compose.Compose}"
        const val Navigation =
            "androidx.navigation:navigation-compose:${Versions.Compose.Navigation}"
        const val HiltNavigationCompose =
            "androidx.hilt:hilt-navigation-compose:${Versions.Compose.HiltNavigationCompose}"
    }

    object Material {
        const val Material3 = "androidx.compose.material3:material3:${Versions.Material.Material3}"
        const val Material3WindowSizeClass =
            "androidx.compose.material3:material3-window-size-class:${Versions.Material.Material3}"
    }

    object DI {
        const val DaggerHilt = "com.google.dagger:hilt-android:${Versions.DI.Hilt}"
        const val DaggerHiltCompiler =
            "com.google.dagger:hilt-android-compiler:${Versions.DI.Hilt}"
    }

    object Retrofit {
        const val Retrofit = "com.squareup.retrofit2:retrofit:${Versions.Retrofit.Retrofit}"
        const val Gson = "com.squareup.retrofit2:converter-gson:${Versions.Retrofit.Retrofit}"
    }
}