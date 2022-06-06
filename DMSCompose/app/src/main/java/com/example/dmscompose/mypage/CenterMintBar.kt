package com.example.dmscompose.mypage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dmscompose.ui.theme.Black100
import com.example.dmscompose.ui.theme.DMSComposeTheme
import com.example.dmscompose.ui.theme.Mint
import com.example.dmscompose.ui.theme.font

@Composable
fun CenterMintBar(text:String){
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
            text = text,
            color = Color.White,
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
}