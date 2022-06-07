package com.example.composepractice.main

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){
    val loading = mutableStateOf(true)

    fun circleProgressLoading(){
        viewModelScope.launch {
            delay(2000)
            loading.value = false
            Log.d(TAG, "circleProgressLoading: "+loading.value)
        }
    }
}