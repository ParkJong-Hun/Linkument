package com.pjh.linkument_android_app.ui.template

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pjh.linkument_android_app.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TemplateScreen(
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable (() -> Unit)? = null,
    systemBarPaddingEnabled: Boolean = true,
    content: @Composable () -> Unit = {},
) {
    Scaffold(
        topBar = {
            Box(
                modifier = if (systemBarPaddingEnabled) {
                    Modifier.statusBarsPadding()
                } else {
                    Modifier
                },
            ) {
                topBar()
            }
        },
        bottomBar = {
            if (bottomBar != null) {
                Box(
                    modifier = if (systemBarPaddingEnabled) {
                        Modifier.navigationBarsPadding()
                    } else {
                        Modifier
                    },
                ) {
                    bottomBar()
                }
            }
        }
    ) {
        if (bottomBar == null) {
            Box(
                modifier = Modifier
                    .padding(it)
                    .then(
                        if (systemBarPaddingEnabled) {
                            Modifier.navigationBarsPadding()
                        } else {
                            Modifier
                        }
                    )
                    .imePadding(),
            ) {
                content()
            }
        } else {
            Box(
                modifier = Modifier
                    .padding(it),
            ) {
                content()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
private fun TemplateScreenPreview() {
    AppTheme {
        TemplateScreen(
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Text(text = "App bar")
                    },
                    colors = TopAppBarDefaults
                        .topAppBarColors(
                            containerColor = MaterialTheme.colorScheme.primaryContainer,
                            scrolledContainerColor = MaterialTheme.colorScheme.background,
                            navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                            actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                )
            },
            bottomBar = {
                Box(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primaryContainer)
                        .fillMaxWidth()
                        .height(36.dp),
                ) {
                    Text(text = "Navigation bar")
                }
            },
        ) {
            Box(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.surface)
                    .padding(
                        horizontal = DefaultScreenHorizontalPadding,
                        vertical = DefaultScreenVerticalPadding
                    )
                    .fillMaxWidth()
                    .size(300.dp),
            ) {
                Text(text = "It is content.")
            }
        }
    }
}