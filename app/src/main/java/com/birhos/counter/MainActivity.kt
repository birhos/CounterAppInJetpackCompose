package com.birhos.counter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.birhos.counter.counter.CounterScreen
import com.birhos.counter.ui.theme.CounterRememberTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterRememberTheme {
                Surface(color = MaterialTheme.colors.background) {
                    CounterScreen()
                }
            }
        }
    }
}
