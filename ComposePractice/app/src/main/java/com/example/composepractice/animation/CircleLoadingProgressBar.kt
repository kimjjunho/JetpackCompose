package com.example.composepractice.animation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CircleLoadingProgressBar(
    isDisplayed: Boolean
){
    if(isDisplayed) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(),
            horizontalArrangement = Arrangement.Center
        ) {
            CircularProgressIndicator(
                color = MaterialTheme.colors.primary,

            )
        }
    }
}