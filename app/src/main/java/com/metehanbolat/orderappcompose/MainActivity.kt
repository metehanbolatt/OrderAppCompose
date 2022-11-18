package com.metehanbolat.orderappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.orderappcompose.core.presentation.Navigation
import com.metehanbolat.orderappcompose.ui.theme.OrderAppComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OrderAppComposeTheme {
                Navigation()
            }
        }
    }
}
