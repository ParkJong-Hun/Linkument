package com.pjh.linkument_android_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pjh.linkument_android_app.ui.theme.AppTheme
import com.pjh.linkument_android_app.ui.theme.md_theme_light_secondary
import com.pjh.linkument_android_app.ui.theme.md_theme_light_tertiary

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(modifier = Modifier
                            .width(100.dp)
                            .height(60.dp),
                            onClick = { /*TODO*/ }) {
                            Greeting("Android")
                        }
                        OutlinedButton(modifier = Modifier
                            .width(100.dp)
                            .height(60.dp),
                            onClick = { /*TODO*/ }) {
                            Greeting("Android")
                        }
                        Button(modifier = Modifier
                            .width(100.dp)
                            .height(60.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = md_theme_light_secondary),
                            onClick = { /*TODO*/ }) {
                            Greeting("Android")
                        }
                        Button(modifier = Modifier
                            .width(100.dp)
                            .height(60.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = md_theme_light_tertiary),
                            onClick = { /*TODO*/ }) {
                            Greeting("Android")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppTheme {
        Greeting("Android")
    }
}