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

    fun progressLoading(){
        viewModelScope.launch {
            delay(10000)
            loading.value = false
            Log.d(TAG, "linearProgressLoading: "+loading.value)
        }
    }
}