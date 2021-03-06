package com.example.composepractice.main

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.CalendarView
import android.widget.DatePicker
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.view.ContextThemeWrapper
import androidx.compose.foundation.background
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.graphics.green
import androidx.core.graphics.toColor
import androidx.recyclerview.widget.RecyclerView
import com.example.composepractice.R
import com.example.composepractice.animation.CircleLoadingProgressBar
import com.example.composepractice.animation.LinearLoadingProgressBar
import com.example.composepractice.animation.LinearProgressBar
import com.example.composepractice.lazycolumn.ItemCard
import com.example.composepractice.ui.theme.Black
import com.example.composepractice.ui.theme.ComposePracticeTheme
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme (darkTheme = true) {
                //setTheme(R.style.Theme_ComposePractice1)
                CalendarStyle()
            }
        }
    }

    //https://www.youtube.com/watch?v=KHI35uK3b_o

    @Composable
    fun CalendarStyle (){
        val i = 0
        var date by remember {
            mutableStateOf("")
        }
        Scaffold(
            content = {
                AndroidView(factory = {CalendarView(ContextThemeWrapper(it,R.style.Theme_ComposePractice1))}, update = {
                    it.setOnDateChangeListener{ CalendarView, year, month, day ->

                    }
                })
            })


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

    //?????? ??????????????????
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

    //??? 3??? ????????? ???????????????
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


    //????????? ????????? ???????????????
    @Composable
    fun CircleLoadingProgress(
        viewModel: MainViewModel = viewModel()
    ){
        val loading = viewModel.loading.value
        viewModel.progressLoading()
        CircleLoadingProgressBar(isDisplayed = loading)
    }




    //???????????? ??????
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

    // ????????? ?????? ??????
    /*@Composable
    fun Greeting(name: String) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = ""
            )
            Column {
                Text(text = "?????? : $name!")
                Text(text = "?????? : ????????? ??????")
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