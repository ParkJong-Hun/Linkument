package com.pjh.linkument_android_app.feature.firststep

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
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
fun SignUpRoute(
    modifier: Modifier = Modifier,
    viewModel: SignUpViewModel = hiltViewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    SignUpScreen(
        uiState = uiState,
        checkUser = viewModel::checkId,
        signUp = viewModel::signUp,
        modifier = modifier,
    )
}

@Composable
fun SignUpScreen(
    uiState: SignUpUiState,
    checkUser: (String) -> Unit,
    signUp: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
    ) {
        SignUpContent(
            onCheckUserButtonClick = checkUser, onRegisterButtonClick = signUp, modifier = modifier
        )
        when (uiState) {
            is SignUpUiState.None -> Unit
            is SignUpUiState.Loading -> {
                // TODO showLoadingView
            }
            is SignUpUiState.CheckValid -> {
                // TODO sign up button enable
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SignUpContent(
    onCheckUserButtonClick: (String) -> Unit,
    onRegisterButtonClick: (String) -> Unit,
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
        contentAlignment = Alignment.TopStart
    ) {
        Column(
            modifier = modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Row(
                modifier = Modifier.padding(top = 50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextField(
                    value = nickname,
                    onValueChange = onNicknameChange,
                    modifier = Modifier.fillMaxWidth(0.7f),
                    label = {
                        Text("Nickname")
                    },
                    maxLines = 1,
                )
                Spacer(modifier = Modifier.width(8.dp))
                Button(
                    onClick = { onCheckUserButtonClick(nickname) },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = true,
                ) {
                    Text(
                        text = "Check",
                        maxLines = 1,
                        style = MaterialTheme.typography.labelSmall
                    )
                }
            }
            Button(
                onClick = { onRegisterButtonClick(nickname) },
                modifier = Modifier.fillMaxWidth(),
                enabled = true,
            ) {
                Text(text = "Register")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpScreenView() {
    SignUpContent(
        onCheckUserButtonClick = {},
        onRegisterButtonClick = {},
    )
}