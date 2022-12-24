import org.gradle.api.artifacts.dsl.DependencyHandler

internal fun DependencyHandler.implementation(dependency: String) {
    add("implementation", dependency)
}

internal fun DependencyHandler.testImplementation(dependency: String) {
    add("testImplementation", dependency)
}

internal fun DependencyHandler.androidTestImplementation(dependency: String) {
    add("androidTestImplementation", dependency)
}

internal fun DependencyHandler.debugImplementation(dependency: String) {
    add("debugImplementation", dependency)
}

internal fun DependencyHandler.kapt(dependency: String) {
    add("kapt", dependency)
}