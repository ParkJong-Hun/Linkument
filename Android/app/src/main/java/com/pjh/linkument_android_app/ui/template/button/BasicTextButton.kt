package com.pjh.linkument_android_app.ui.template.button

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.pjh.linkument_android_app.ui.theme.AppTheme
import com.pjh.linkument_android_app.ui.theme.ButtonColorType
import com.pjh.linkument_android_app.ui.theme.LightTypography

@Composable
fun BasicTextButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enabled: Boolean = true,
    colorType: ButtonColorType = ButtonColorType.Primary,
    textMaxLines: Int = 1,
    textStyle: TextStyle = LightTypography.labelMedium,
    text: String,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
    ) {
        Text(
            text = text,
            maxLines = textMaxLines,
            style = textStyle,
            color = if (enabled) {
                when (colorType) {
                    ButtonColorType.Primary -> MaterialTheme.colorScheme.primary
                    ButtonColorType.PrimaryContainer -> MaterialTheme.colorScheme.primaryContainer
                    ButtonColorType.Secondary -> MaterialTheme.colorScheme.secondary
                    ButtonColorType.SecondaryContainer -> MaterialTheme.colorScheme.secondaryContainer
                    ButtonColorType.Tertiary -> MaterialTheme.colorScheme.tertiary
                    ButtonColorType.TertiaryContainer -> MaterialTheme.colorScheme.tertiaryContainer
                    ButtonColorType.Error -> MaterialTheme.colorScheme.error
                }
            } else {
                MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f)
            }
        )
    }
}

@Preview(group = "LightMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun BasicTextButtonLightPreview() {
    AppTheme {
        Column {
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "Primary",
                colorType = ButtonColorType.Primary,
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "PrimaryContainer",
                colorType = ButtonColorType.PrimaryContainer,
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "Secondary",
                colorType = ButtonColorType.Secondary,
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "SecondaryContainer",
                colorType = ButtonColorType.SecondaryContainer,
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "Tertiary",
                colorType = ButtonColorType.Tertiary,
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "TertiaryContainer",
                colorType = ButtonColorType.TertiaryContainer,
            )
            BasicTextButton(
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
private fun BasicTextButtonDarkPreview() {
    AppTheme {
        Column {
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                colorType = ButtonColorType.Primary,
                text = "Primary",
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "PrimaryContainer",
                colorType = ButtonColorType.PrimaryContainer,
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                text = "Secondary",
                colorType = ButtonColorType.Secondary,
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                colorType = ButtonColorType.SecondaryContainer,
                text = "SecondaryContainer",
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                colorType = ButtonColorType.Tertiary,
                text = "Tertiary",
            )
            BasicTextButton(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                onClick = {},
                colorType = ButtonColorType.TertiaryContainer,
                text = "TertiaryContainer",
            )
            BasicTextButton(
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