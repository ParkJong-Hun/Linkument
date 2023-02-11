package com.pjh.linkument_android_app.ui.template.button

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pjh.linkument_android_app.ui.theme.AppTheme
import com.pjh.linkument_android_app.ui.theme.ButtonColorType

@Composable
fun DoubleButton(
    modifier: Modifier = Modifier,
    leftButtonText: String,
    onClickLeftButton: () -> Unit,
    leftButtonEnabled: Boolean = true,
    leftButtonColorType: ButtonColorType = ButtonColorType.Primary,
    rightButtonText: String,
    onClickRightButton: () -> Unit,
    rightButtonEnabled: Boolean = true,
    rightButtonColorType: ButtonColorType = ButtonColorType.Secondary,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        BasicButton(
            modifier = Modifier.weight(1f),
            onClick = { onClickLeftButton },
            colorType = leftButtonColorType,
            text = leftButtonText,
            enabled = leftButtonEnabled
        )
        Spacer(modifier = Modifier.width(8.dp))
        BasicButton(
            modifier = Modifier.weight(1f),
            onClick = { onClickRightButton },
            colorType = rightButtonColorType,
            text = rightButtonText,
            enabled = rightButtonEnabled
        )
    }
}

@Preview(group = "LightMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun DoubleButtonLightPreview() {
    AppTheme {
        DoubleButton(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
            leftButtonText = "Agree",
            onClickLeftButton = {},
            rightButtonText = "Not Agree",
            onClickRightButton = {})
    }
}

@Preview(group = "DarkMode", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DoubleButtonDarkPreview() {
    AppTheme {
        DoubleButton(modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
            leftButtonText = "Agree",
            onClickLeftButton = {},
            rightButtonText = "Not Agree",
            onClickRightButton = {})
    }
}