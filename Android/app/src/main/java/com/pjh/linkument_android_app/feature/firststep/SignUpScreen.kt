package com.pjh.linkument_android_app.feature.firststep

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.pjh.linkument_android_app.ui.theme.DefaultScreenShortHorizontalPadding
import com.pjh.linkument_android_app.ui.theme.DefaultScreenVerticalPadding

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
fun SignUpRoute(
    modifier: Modifier = Modifier,
    viewModel: SignUpViewModel,
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    SignUpScreen(
        uiState = uiState,
        signUp = viewModel::signUp,
        modifier = modifier,
    )
}

@Composable
fun SignUpScreen(
    uiState: SignUpUiState,
    signUp: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        SignUpContent(
            onRegisterButtonClick = signUp,
            modifier = modifier
        )
        when (uiState) {
            is SignUpUiState.None -> Unit
            is SignUpUiState.Loading -> {
                // TODO showLoadingView
            }
            is SignUpUiState.Success -> {
                // TODO left Composable
            }
            is SignUpUiState.Error -> {
                // TODO showErrorDialog
            }
        }
    }
}

@Composable
private fun SignUpContent(
    onRegisterButtonClick: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .padding(
                horizontal = DefaultScreenShortHorizontalPadding,
                vertical = DefaultScreenVerticalPadding,
            )
    ) {
        // TODO showSignUpView
    }
}