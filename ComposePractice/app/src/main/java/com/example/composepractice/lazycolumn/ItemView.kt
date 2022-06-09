package com.example.composepractice.lazycolumn

import android.app.Activity
import android.app.Application
import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.composepractice.main.MainActivity

@Composable
fun ItemCard(num:Int, context: Context){
    Card(
        Modifier
            .padding(12.dp)
            .border(width = 4.dp, color = Color.Black)
            .fillMaxWidth()
            .height(100.dp)
            .clickable(onClick = { toast(num, context) })
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = "Android Study$num")
        }
    }
}

fun toast(num:Int, context: Context){
    Toast.makeText(context,num.toString(),Toast.LENGTH_SHORT).show()
}