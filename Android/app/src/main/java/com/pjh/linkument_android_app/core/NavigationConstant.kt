package com.pjh.linkument_android_app.core

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.pjh.linkument_android_app.feature.firststep.firstStepGraph

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun LinkumentScreen(
    viewModel: LinkumentViewModel = hiltViewModel(),
) {
    val scrollState = rememberScrollState()
    val appState by viewModel.appState.collectAsStateWithLifecycle()
    val navController = rememberNavController()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        when (appState) {
            is LinkumentAppState.None -> {
                NavHost(
                    navController = navController,
                    startDestination = LinkumentNavConstant.FirstStep.LoginRoute,
                ) {
                    firstStepGraph(
                        navigateToHome = {
                            viewModel.transition(LinkumentAppState.IsLoggedIn)
                        },
                        navigateToSignUp = {
                            navController.navigate(route = LinkumentNavConstant.FirstStep.SignUpRoute)
                        },
                        nestedGraphs = {
                            // no-op
                        },
                    )
                }
            }
            is LinkumentAppState.IsLoggedIn -> {
                // TODO
            }
        }
    }
}