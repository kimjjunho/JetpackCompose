package com.example.dmscompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign.Companion.Center
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dmscompose.ui.theme.DMSComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DMSComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android", { Toast.makeText(applicationContext, "123123", Toast.LENGTH_SHORT).show() })
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    onBtnClick: () -> Unit
) {
    Surface (
        modifier = Modifier
            .fillMaxSize()
            .wrapContentHeight(CenterVertically)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello $name!", textAlign = Center, modifier = Modifier.padding(bottom = 16.dp))
            Button(onClick = { onBtnClick() }) {

            }
        }

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    DMSComposeTheme {
        Greeting("Android") {

        }
    }
}