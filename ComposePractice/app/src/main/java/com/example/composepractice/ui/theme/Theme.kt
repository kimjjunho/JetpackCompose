package com.example.composepractice.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

//primary 일 순위
//primaryVariant 기본 변형
//secondary 이 순위
//secondary 이 순위 변형
//background 배경
//surface 표면
//error 오류

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple200,
    secondary = Purple200,
    secondaryVariant = Purple200,
    background = Purple200,
    surface = Purple200,
    error = Purple200

    //오류 발생 이유를 모르겠음
    /*onPrimary = Teal200,
    onSecondary = Purple200,
    onBackground = Purple200,
    onSurface = Purple200,
    onError = Purple200*/

)

private val LightColorPalette = lightColors(
    primary = Teal200,
    primaryVariant = Teal200,
    secondary = Teal200,
    secondaryVariant = Teal200,
    background = Teal200,
    surface = Teal200,
    error = Teal200


    /*onPrimary = Teal200,
    onSecondary = Teal200,
    onBackground = Teal200,
    onSurface = Teal200,
    onError = Teal200,*/

)

@Composable
fun ComposePracticeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit,
) {
    val colors =
    if (darkTheme) { DarkColorPalette }
    else { LightColorPalette }
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}