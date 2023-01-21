import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.defaultDependencies() {
    implementation(Dependencies.Default.Core)
    testImplementation(Dependencies.Default.Junit)
    implementation(Dependencies.Default.LifeCycleRuntime)
    implementation(Dependencies.Default.LifeCycleRuntimeCompose)
    implementation(Dependencies.Default.LifeCycleViewModel)
    implementation(Dependencies.Default.ActivityCompose)
    androidTestImplementation(Dependencies.Default.ExtJunit)
    androidTestImplementation(Dependencies.Default.EspressoCore)
}

fun DependencyHandler.composeDependencies() {
    implementation(Dependencies.Compose.Ui)
    implementation(Dependencies.Compose.UiToolingPreview)
    debugImplementation(Dependencies.Compose.UiTooling)
    androidTestImplementation(Dependencies.Compose.UiJunit)
    implementation(Dependencies.Compose.UiTooling)
    implementation(Dependencies.Compose.Foundation)
    implementation(Dependencies.Compose.RuntimeLiveData)
    // make sure I need it
    // implementation(Dependencies.Compose.CONSTRAINT_LAYOUT)
    implementation(Dependencies.Compose.Navigation)
}

fun DependencyHandler.materialDesign() {
    implementation(Dependencies.Material.Material3)
    implementation(Dependencies.Material.Material3WindowSizeClass)
}

fun DependencyHandler.di() {
    implementation(Dependencies.DI.DaggerHilt)
    kapt(Dependencies.DI.DaggerHiltCompiler)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.Retrofit.Retrofit)
    implementation(Dependencies.Retrofit.Gson)
}