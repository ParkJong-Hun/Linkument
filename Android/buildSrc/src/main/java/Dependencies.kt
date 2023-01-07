object Dependencies {
    object Default {
        const val CORE = "androidx.core:core-ktx:${Versions.Default.CORE}"
        const val JUNIT = "junit:junit:${Versions.Default.JUNIT}"
        const val LIFE_CYCLE =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.Default.LIFE_CYCLE}"
        const val ACTIVITY_COMPOSE =
            "androidx.activity:activity-compose:${Versions.Default.ACTIVITY_COMPOSE}"
        const val EXT_JUNIT = "androidx.test.ext:junit:${Versions.Default.EXT_JUNIT}"
        const val ESPRESSO_CORE =
            "androidx.test.espresso:espresso-core:${Versions.Default.ESPRESSO_CORE}"
    }

    object Compose {
        const val UI = "androidx.compose.ui:ui:${Versions.Compose.COMPOSE}"
        const val UI_TOOLING_PREVIEW =
            "androidx.compose.ui:ui-tooling-preview:${Versions.Compose.COMPOSE}"
        const val UI_TOLLING = "androidx.compose.ui:ui-tooling:${Versions.Compose.COMPOSE}"
        const val UI_JUNIT = "androidx.compose.ui:ui-test-junit4:${Versions.Compose.COMPOSE}"
        const val MATERIAL = "androidx.compose.material3:material3:${Versions.Compose.COMPOSE}"
        const val FOUNDATION = "androidx.compose.foundation:foundation:${Versions.Compose.COMPOSE}"
        const val MATERIAL_ICONS_CORE =
            "androidx.compose.material3:material3-icons-core:${Versions.Compose.COMPOSE}"
        const val MATERIAL_ICONS_EXTENDED =
            "androidx.compose.material3:material3-icons-extended:${Versions.Compose.COMPOSE}"
        const val RUNTIME_LIVEDATA =
            "androidx.compose.runtime:runtime-livedata:${Versions.Compose.COMPOSE}"
        const val CONSTRAINT_LAYOUT =
            "androidx.constraintlayout:constraintlayout-compose:${Versions.Compose.COMPOSE}"
        const val NAVIGATION =
            "androidx.navigation:navigation-compose:${Versions.Compose.NAVIGATION}"
    }

    object DI {
        const val DAGGER_HILT = "com.google.dagger:hilt-android:${Versions.DI.HILT}"
        const val DAGGER_HILT_COMPILER =
            "com.google.dagger:hilt-android-compiler:${Versions.DI.HILT}"
    }

    object Retrofit {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.Retrofit.RETROFIT}"
        const val GSON = "com.squareup.retrofit2:converter-gson:${Versions.Retrofit.RETROFIT}"
    }
}