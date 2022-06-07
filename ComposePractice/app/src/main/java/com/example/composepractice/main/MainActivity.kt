package com.example.composepractice.main

import android.content.ContentValues.TAG
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractice.animation.CircleLoadingProgressBar
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme (darkTheme = true){
                CircleLoadingProgress()
            }
        }
    }

    @Composable
    fun CircleLoadingProgress(
        viewModel: MainViewModel = viewModel()
    ){
        val loading = viewModel.loading.value
        viewModel.circleProgressLoading()
        CircleLoadingProgressBar(isDisplayed = loading)
    }


    //다크모드 적용
    /*@Composable
    fun Btn(){
        Box(
            modifier = Modifier
                .height(30.dp)
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colors.primary,
                    shape = RoundedCornerShape(15.dp)
                )
        ) {
            Text(
                text = "dd",
                color = MaterialTheme.colors.primary,
                fontFamily = font,
                fontWeight = FontWeight.SemiBold,
                fontSize = 11.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.CenterHorizontally)
                    .fillMaxHeight()
                    .wrapContentHeight(Alignment.CenterVertically)
            )
        }
    }*/

    // 간단한 연습 코드
    /*@Composable
    fun Greeting(name: String) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = ""
            )
            Column {
                Text(text = "이름 : $name!")
                Text(text = "특징 : 귀엽게 생김")
            }
        }
    }

    @Composable
    fun Show(name: String){
        (Text(text = name))
    }*/

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun DefaultPreview() {
        ComposePracticeTheme (darkTheme = true){
        }
    }
}