package com.pjh.linkument_android_app.feature.firststep

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pjh.linkument_android_app.core.LinkumentNavConstant

fun NavController.navigateToFirstStepGraph(navOptions: NavOptions? = null) {
    this.navigate(
        route = LinkumentNavConstant.FirstStep.graphName,
        navOptions = navOptions,
    )
}

fun NavGraphBuilder.firstStepGraph(
    navigateToHome: () -> Unit,
    navigateToSignUp: () -> Unit,
    nestedGraphs: NavGraphBuilder.() -> Unit,
) {
    navigation(
        route = LinkumentNavConstant.FirstStep.graphName,
        startDestination = LinkumentNavConstant.FirstStep.LoginRoute,
    ) {
        composable(route = LinkumentNavConstant.FirstStep.LoginRoute) {
            LoginRoute(
                navigateToHome = navigateToHome,
                navigateToSignUp = navigateToSignUp,
            )
        }
        composable(route = LinkumentNavConstant.FirstStep.SignUpRoute) {
            SignUpRoute()
        }
        nestedGraphs()
    }
}