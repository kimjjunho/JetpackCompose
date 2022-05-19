package com.example.dmscompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.dmscompose.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */

)
val MyPageFont = Typography(
    body1 = TextStyle(
        fontSize = 10.sp,fontFamily = font,fontWeight = FontWeight.Light, color = Color.White
    )
)

val MyPageFont2 = Typography(
    body1 = TextStyle(
        color = Mint,fontFamily = font,fontWeight = FontWeight.SemiBold,fontSize = 11.sp
    ),
    body2 = TextStyle(color = Gray100,fontFamily = font,fontWeight = FontWeight.Light,fontSize = 9.sp)
)