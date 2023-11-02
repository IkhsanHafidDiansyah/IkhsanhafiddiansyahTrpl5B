package com.ikhsan.trpl5b.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ikhsan.trpl5b.Routes

@Composable
fun Home(navController: NavHostController) {

    //Create a basic counter to display on screen
    var counter by remember {
        mutableStateOf(0)
    }

    //Box composable to center Items
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White), contentAlignment = Alignment.Center
    ) {

        //A Column composable
        Column {
            Text(text = "Home, Counter is $counter", color = Color.Black)

            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { counter++ }) {
                Text(text = "Increment Counter", color = Color.White)
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                navController.navigate(Routes.Profile.route) }) {
                Text(text = "Navigate to Profile", color = Color.White)
            }

            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                navController.navigate(Routes.Setting.route + "/$counter")

            }) {
                Text(text = "Navigate to Settings", color = Color.White)
            }

        }

    }
}