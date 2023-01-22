package com.pjh.linkument_android_app.feature.firststep

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navigation

private const val firstStepGraphRoutePattern = "first_step_graph"
const val loginRoute = "login_route"
const val signUpRoute = "sign_up_route"

fun NavController.navigateToFirstStepGraph(navOptions: NavOptions? = null) {
    this.navigate(firstStepGraphRoutePattern, navOptions)
}

fun NavGraphBuilder.firstStepGraph(
    navigateToHome: () -> Unit,
    navigateToSignUp: () -> Unit,
    nestedGraphs: NavGraphBuilder.() -> Unit
) {
    navigation(
        route = firstStepGraphRoutePattern, startDestination = loginRoute
    ) {
        composable(route = loginRoute) {
            LoginRoute(
                navigateToHome = navigateToHome,
                navigateToSignUp = navigateToSignUp,
            )
        }
        composable(route = signUpRoute) {
            SignUpRoute()
        }
        nestedGraphs()
    }
}