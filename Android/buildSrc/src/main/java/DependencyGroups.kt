import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.defaultDependencies() {
    implementation(Dependencies.Default.CORE)
    testImplementation(Dependencies.Default.JUNIT)
    implementation(Dependencies.Default.LIFE_CYCLE)
    implementation(Dependencies.Default.ACTIVITY_COMPOSE)
    androidTestImplementation(Dependencies.Default.EXT_JUNIT)
    androidTestImplementation(Dependencies.Default.ESPRESSO_CORE)
}

fun DependencyHandler.composeDependencies() {
    implementation(Dependencies.Compose.UI)
    implementation(Dependencies.Compose.UI_TOOLING_PREVIEW)
    debugImplementation(Dependencies.Compose.UI_TOLLING)
    androidTestImplementation(Dependencies.Compose.UI_JUNIT)
    implementation(Dependencies.Compose.UI_TOLLING)
    implementation(Dependencies.Compose.MATERIAL)
    implementation(Dependencies.Compose.FOUNDATION)
    implementation(Dependencies.Compose.MATERIAL_ICONS_CORE)
    implementation(Dependencies.Compose.MATERIAL_ICONS_EXTENDED)
    implementation(Dependencies.Compose.RUNTIME_LIVEDATA)
    implementation(Dependencies.Compose.CONSTRAINT_LAYOUT)
    implementation(Dependencies.Compose.NAVIGATION)
}

fun DependencyHandler.di() {
    implementation(Dependencies.DI.DAGGER_HILT)
    kapt(Dependencies.DI.DAGGER_HILT_COMPILER)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.Retrofit.RETROFIT)
    implementation(Dependencies.Retrofit.GSON)
}