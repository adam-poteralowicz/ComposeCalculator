package com.apap.composator.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.apap.cameraManager.ui.theme.ComposatorTheme
import dagger.hilt.android.AndroidEntryPoint

private const val MAIN = "main"

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposatorTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = MAIN) {
                    composable(MAIN) {
                        MainScreen(navigate = {})
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposatorTheme {
            MainScreen {}
        }
    }
}