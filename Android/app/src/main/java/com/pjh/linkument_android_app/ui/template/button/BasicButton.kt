package com.pjh.linkument_android_app.ui.template.button

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.pjh.linkument_android_app.ui.theme.AppTheme
import com.pjh.linkument_android_app.ui.theme.ButtonColorType
import com.pjh.linkument_android_app.ui.theme.LightTypography

@Composable
fun BasicButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enabled: Boolean = true,
    colorType: ButtonColorType = ButtonColorType.Primary,
    textMaxLines: Int = 1,
    textStyle: TextStyle = LightTypography.labelMedium,
    text: String,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = when (colorType) {
            ButtonColorType.Primary -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary,
            )
            ButtonColorType.PrimaryContainer -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            )
            ButtonColorType.Secondary -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary,
                contentColor = MaterialTheme.colorScheme.onSecondary,
            )
            ButtonColorType.SecondaryContainer -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
            )
            ButtonColorType.Tertiary -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.onTertiary,
            )
            ButtonColorType.TertiaryContainer -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.tertiaryContainer,
                contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
            )
            ButtonColorType.Error -> ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.error,
                contentColor = MaterialTheme.colorScheme.onError,
            )
        },
    ) {
        Text(
            text = text,
            maxLines = textMaxLines,
            style = textStyle,
            color = when (colorType) {
                ButtonColorType.Primary -> MaterialTheme.colorScheme.onPrimary
                ButtonColorType.PrimaryContainer -> MaterialTheme.colorScheme.onPrimaryContainer
                ButtonColorType.Secondary -> MaterialTheme.colorScheme.onSecondary
                ButtonColorType.SecondaryContainer -> MaterialTheme.colorScheme.onSecondaryContainer
                ButtonColorType.Tertiary -> MaterialTheme.colorScheme.onTertiary
                ButtonColorType.TertiaryContainer -> MaterialTheme.colorScheme.onTertiaryContainer
                ButtonColorType.Error -> MaterialTheme.colorScheme.onError
            }
        )
    }
}

@Preview(group = "LightMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun BasicButtonLightPreview() {
    AppTheme {
        Column {
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "Primary",
                colorType = ButtonColorType.Primary,
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "PrimaryContainer",
                colorType = ButtonColorType.PrimaryContainer,
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "Secondary",
                colorType = ButtonColorType.Secondary,
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "SecondaryContainer",
                colorType = ButtonColorType.SecondaryContainer,
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "Tertiary",
                colorType = ButtonColorType.Tertiary,
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "TertiaryContainer",
                colorType = ButtonColorType.TertiaryContainer,
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "Error",
                colorType = ButtonColorType.Error,
            )
        }
    }
}

@Preview(group = "DarkMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun BasicButtonDarkPreview() {
    AppTheme {
        Column {
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                colorType = ButtonColorType.Primary,
                text = "Primary",
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "PrimaryContainer",
                colorType = ButtonColorType.PrimaryContainer,
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "Secondary",
                colorType = ButtonColorType.Secondary,
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                colorType = ButtonColorType.SecondaryContainer,
                text = "SecondaryContainer",
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                colorType = ButtonColorType.Tertiary,
                text = "Tertiary",
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                colorType = ButtonColorType.TertiaryContainer,
                text = "TertiaryContainer",
            )
            BasicButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                colorType = ButtonColorType.Error,
                text = "Error",
            )
        }
    }
}