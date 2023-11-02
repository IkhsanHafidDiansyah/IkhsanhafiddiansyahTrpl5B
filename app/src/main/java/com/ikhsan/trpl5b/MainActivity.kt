package com.ikhsan.trpl5b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ikhsan.trpl5b.screens.Profile
import com.ikhsan.trpl5b.screens.Setting
import com.ikhsan.trpl5b.screens.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colorScheme.background) {
                ScreenMain()
            }
        }
    }
}


@Composable
fun ScreenMain() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(Routes.Home.route) {
            Home(navController = navController)
        }
        composable(Routes.Profile.route) {
            Profile()
        }
        composable("${Routes.Setting.route}/{id}") { navBackStack ->
            val counter = navBackStack.arguments?.getString("id")
            Setting(number = counter)
        }
    }
}
