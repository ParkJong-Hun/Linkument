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
    implementation(Dependencies.Compose.FOUNDATION)
    implementation(Dependencies.Compose.RUNTIME_LIVEDATA)
    // make sure I need it
    // implementation(Dependencies.Compose.CONSTRAINT_LAYOUT)
    implementation(Dependencies.Compose.NAVIGATION)
}

fun DependencyHandler.materialDesign() {
    implementation(Dependencies.Material.MATERIAL3)
    implementation(Dependencies.Material.MATERIAL3_WINDOW_SIZE_CLASS)
}

fun DependencyHandler.di() {
    implementation(Dependencies.DI.DAGGER_HILT)
    kapt(Dependencies.DI.DAGGER_HILT_COMPILER)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.Retrofit.RETROFIT)
    implementation(Dependencies.Retrofit.GSON)
}