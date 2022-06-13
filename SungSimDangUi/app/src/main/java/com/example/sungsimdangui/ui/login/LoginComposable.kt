package com.example.sungsimdangui.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sungsimdangui.ui.theme.Gray
import com.example.sungsimdangui.ui.theme.font

@Composable
fun LoginTopText(painter: Painter){
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentWidth(Alignment.CenterHorizontally)
        .width(280.dp)
        .wrapContentHeight(Alignment.Top)
        .height(66.dp)
    ) {
        Text(text = "마음을 나누다",color = Gray,
            fontSize = 18.sp, fontFamily = font,
            fontWeight = FontWeight.SemiBold
            ,modifier = Modifier
                .height(25.dp))
        Row() {
            Text(text = "心스타그램",color = MaterialTheme.colors.onSecondary,
                fontSize = 30.sp, fontFamily = font,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .height(40.dp))
            Icon(painter = painter, contentDescription = "",
                Modifier.padding(5.dp))
        }
    }
}