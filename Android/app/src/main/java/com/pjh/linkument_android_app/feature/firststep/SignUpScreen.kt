package com.pjh.linkument_android_app.feature.firststep

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.pjh.linkument_android_app.R
import com.pjh.linkument_android_app.ui.template.button.BasicButton
import com.pjh.linkument_android_app.ui.theme.AppTheme
import com.pjh.linkument_android_app.ui.theme.ButtonColorType
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
    modifier: Modifier = Modifier,
    uiState: SignUpUiState,
    checkUser: (String) -> Unit,
    signUp: (String) -> Unit,
) {
    var checkValid by remember { mutableStateOf(false) }
    Box(
        modifier = modifier,
    ) {
        SignUpContent(
            modifier = modifier,
            checkValid = checkValid,
            onCheckUserButtonClick = checkUser,
            onRegisterButtonClick = signUp,
        )
        when (uiState) {
            is SignUpUiState.None -> Unit
            is SignUpUiState.Loading -> {
                // TODO showLoadingView
            }
            is SignUpUiState.CheckValid -> {
                checkValid = true
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
    modifier: Modifier = Modifier,
    checkValid: Boolean,
    onCheckUserButtonClick: (String) -> Unit,
    onRegisterButtonClick: (String) -> Unit,
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
                    label = { Text(text = stringResource(R.string.L0102_nickname_text_field_label)) },
                    singleLine = true,
                )
                Spacer(modifier = Modifier.width(8.dp))
                BasicButton(
                    onClick = { onCheckUserButtonClick(nickname) },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = nickname.isNotBlank(),
                    text = stringResource(R.string.L0102_check_button_label),
                    textStyle = MaterialTheme.typography.labelSmall,
                )
            }
            BasicButton(
                onClick = { onRegisterButtonClick(nickname) },
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                enabled = checkValid,
                colorType = ButtonColorType.Tertiary,
                text = stringResource(R.string.L0102_register_button_label),
                textStyle = MaterialTheme.typography.labelLarge
            )
        }
    }
}

@Preview(group = "lightMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(group = "darkMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SignUpScreenPreview() {
    AppTheme {
        SignUpContent(
            checkValid = true,
            onCheckUserButtonClick = {},
            onRegisterButtonClick = {},
        )
    }
}