package com.example.composepractice.main

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.example.composepractice.animation.CircleLoadingProgressBar
import com.example.composepractice.animation.LinearLoadingProgressBar
import com.example.composepractice.animation.LinearProgressBar
import com.example.composepractice.lazycolumn.ItemCard
import com.example.composepractice.ui.theme.ComposePracticeTheme
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme (darkTheme = true){
                LazyColumnStyle4()
            }
        }
    }

    @Composable
    fun LazyColumnStyle4(){
        LazyColumn(){
            itemsIndexed(
                listOf(100,200,300)
            ){index, item ->  
                ItemCard(num = item,this@MainActivity)
            }
        }
    }
    @Composable
    fun LazyColumnStyle3(){
        LazyColumn(){
            items(20){
                ItemCard(num = it,applicationContext)
            }
        }
    }

    @Composable
    fun LazyColumnStyle2(){
        LazyColumn(){
            item {
                ItemCard(num = 2,applicationContext)
                ItemCard(num = 3,applicationContext)
            }
        }
    }

    @Composable
    fun LazyColumnStyle1(){
        LazyColumn(){
            item {
                ItemCard(num = 0,applicationContext)
                ItemCard(num = 1,applicationContext)
            }
        }
    }

    //가로 프로그레스바
    @Composable
    fun LinearProgress(
        viewModel: MainViewModel = viewModel()
    ){
        val loading = viewModel.loading.value
        Column(modifier = Modifier.fillMaxWidth()) {
            viewModel.progressLoading()
            LinearProgressBar(loading)
        }
    }

    //원 3개 로딩중 애니메이션
    @Composable
    fun LinearLoadingProgress(
        viewModel: MainViewModel = viewModel()
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val loading = viewModel.loading.value
            viewModel.progressLoading()
            LinearLoadingProgressBar(isDisplayed = loading)
        }
    }


    //동그란 로딩중 애니메이션
    @Composable
    fun CircleLoadingProgress(
        viewModel: MainViewModel = viewModel()
    ){
        val loading = viewModel.loading.value
        viewModel.progressLoading()
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