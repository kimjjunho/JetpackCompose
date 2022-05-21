package com.example.dmscompose.mypage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.dmscompose.R

import com.example.dmscompose.ui.theme.MyPageFont2

@Composable
fun BottomFourView(mintText : String, longText:String, size:Float){
    Row(
        modifier = Modifier
            .fillMaxHeight(size)
            .fillMaxWidth()
    ){
        Column(modifier = Modifier.fillMaxHeight()) {
            Text(text = mintText, style = MyPageFont2.body1,modifier = Modifier
                .padding(0.dp,17.dp)
            )
            Text(text = longText, style = MyPageFont2.body2, modifier = Modifier
                .fillMaxHeight()
                .wrapContentHeight(align = Alignment.Bottom)
                .padding(0.dp, 0.dp, 0.dp, 17.dp)
            )
        }
        Image(
            //drawable 사용할때 11번째 줄 com.example.프젝이름.R을 사용해야 한다.
            painterResource(id = R.drawable.mypage_image_arrow), contentDescription = "",
            modifier = Modifier
                .fillMaxHeight()
                .wrapContentHeight(Alignment.CenterVertically)
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End)
        )
    }
}