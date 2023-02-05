package com.pjh.linkument_android_app.feature.firststep

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.pjh.linkument_android_app.ui.theme.DefaultScreenHorizontalPadding
import com.pjh.linkument_android_app.ui.theme.DefaultScreenVerticalPadding

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun LoginRoute(
    navigateToHome: () -> Unit,
    navigateToSignUp: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = hiltViewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LoginScreen(
        uiState = uiState,
        login = viewModel::login,
        navigateToHome = navigateToHome,
        navigateToSignUp = navigateToSignUp,
        modifier = modifier,
    )
}

@Composable
internal fun LoginScreen(
    uiState: LoginUiState,
    login: (String) -> Unit,
    navigateToHome: () -> Unit,
    navigateToSignUp: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        LoginContent(
            onSignUpButtonClick = navigateToSignUp,
            onLoginButtonClick = login,
            modifier = modifier,
        )
        when (uiState) {
            is LoginUiState.None -> Unit
            is LoginUiState.Loading -> {
                // TODO showLoadingView
            }
            is LoginUiState.LoggedIn -> navigateToHome()
            is LoginUiState.Error -> {
                // TODO showErrorDialog
            }
        }
    }
}

@Composable
private fun LoginContent(
    onSignUpButtonClick: () -> Unit,
    onLoginButtonClick: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .padding(
                horizontal = DefaultScreenHorizontalPadding,
                vertical = DefaultScreenVerticalPadding,
            ),
    ) {
        // TODO showLoginView
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    // TODO
}