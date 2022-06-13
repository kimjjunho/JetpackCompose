package com.example.sungsimdangui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sungsimdangui.ui.login.LoginTopText
import com.example.sungsimdangui.ui.theme.Gray
import com.example.sungsimdangui.ui.theme.SungSimDangUiTheme
import com.example.sungsimdangui.ui.theme.font

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SungSimDangUiTheme(darkTheme = false) {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}

@Composable
fun LoginPage(){
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()) {
        Spacer(modifier = Modifier.height(100.dp))

        LoginTopText(painterResource(id = R.drawable.ic_login_mark))

        var text by remember { mutableStateOf("Hello") }

        Box(
            Modifier
                .fillMaxWidth()
                .wrapContentWidth(CenterHorizontally)
                .width(280.dp)){
            //BasicTextField(value = text, onValueChange = {newText -> text = newText})})
        }
    }

}

@Composable
fun LoginInputTextField(modifier: Modifier){
    val (text, setText) = remember { mutableStateOf("") }
    LoginInputText(text = text, onTextChange = setText, modifier = modifier)
}

@Composable
fun LoginInputText(text: String, onTextChange: (String)->Unit, modifier: Modifier){
    Text(text = text)
}


@Preview(showSystemUi = true,showBackground = true)
@Composable
fun DefaultPreview() {
    SungSimDangUiTheme {
        LoginPage()
    }
}