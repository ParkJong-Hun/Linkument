package com.pjh.linkument_android_app.feature.firststep

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun LoginContent(
    onSignUpButtonClick: () -> Unit,
    onLoginButtonClick: (String) -> Unit,
    modifier: Modifier = Modifier,
) {

    val (nickname, onNicknameChange) = remember { mutableStateOf("") }

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(
                horizontal = DefaultScreenHorizontalPadding,
                vertical = DefaultScreenVerticalPadding,
            ),
        contentAlignment = Alignment.Center
    ) {
        Column {
            TextField(
                value = nickname,
                onValueChange = onNicknameChange,
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Nickname")
                },
                maxLines = 1,
            )
            Row(
                modifier = Modifier.align(alignment = Alignment.End),
            ) {
                Button(
                    onClick = onSignUpButtonClick,
                    modifier = Modifier.defaultMinSize(100.dp),
                    enabled = true,
                ) {
                    Text(text = "Sign Up")
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(
                    onClick = { onLoginButtonClick(nickname) },
                    modifier = Modifier.defaultMinSize(100.dp),
                    enabled = true,
                ) {
                    Text(text = "Login")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    LoginContent(
        onSignUpButtonClick = {},
        onLoginButtonClick = {},
    )
}