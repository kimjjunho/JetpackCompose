package com.example.dmscompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

var darkTheme = false

private val DarkColorPalette = darkColors(
    primary = Black100,
    background = White

)

private val LightColorPalette = lightColors(
    primary = Mint
)

@Composable
fun DMSComposeTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val systemUiController = rememberSystemUiController()

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    if(darkTheme){
        systemUiController.setSystemBarsColor(
            color = Black100
        )
    }else{
        systemUiController.setSystemBarsColor(
            color = Mint
        )
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}