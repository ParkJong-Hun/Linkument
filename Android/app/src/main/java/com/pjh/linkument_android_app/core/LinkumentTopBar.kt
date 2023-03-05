package com.pjh.linkument_android_app.core

import android.content.res.Configuration
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun LinkumentTopBar(
    title: String,
    navigationIconType: NavigationIconType? = null,
    onClickNavigationIcon: () -> Unit = {},
) {
    // TODO
    TopAppBar(
        title = {
            Text(text = title)
        },
        navigationIcon = {
            navigationIconType?.let {
                when (it) {
                    NavigationIconType.Drawer -> Icon(
                        painter = TODO(),
                        contentDescription = null,
                    )
                    NavigationIconType.Back -> Icon(
                        painter = TODO(),
                        contentDescription = null,
                    )
                }
            }
        }
    )
}

@Preview(group = "lightMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(group = "darkMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun LinkumentTopBarPreview() {
    LinkumentTopBar(title = "Linkument")
}

enum class NavigationIconType {
    Drawer, Back,
}