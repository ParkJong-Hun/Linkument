package com.pjh.linkument_android_app.core

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun LinkumentScreen(
    viewModel: LinkumentViewModel = hiltViewModel(),
) {
    val scrollState = rememberScrollState()
    val appState by viewModel.appState.collectAsStateWithLifecycle()

    LinkumentContent(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
        appState = appState,
    )
}

@Composable
private fun LinkumentContent(
    modifier: Modifier = Modifier,
    appState: LinkumentAppState,
) {
    val appScope = rememberCoroutineScope()

    // @TODO navigationUp
    when (appState) {
        is LinkumentAppState.None -> {

        }
        is LinkumentAppState.IsLoggedIn -> {

        }
    }
}