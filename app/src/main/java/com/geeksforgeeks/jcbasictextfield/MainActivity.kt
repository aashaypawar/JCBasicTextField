package com.geeksforgeeks.jcbasictextfield

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // Implementing a Scaffold Layout
            Scaffold(

                // Creating a Top Bar
                topBar = { TopAppBar(title = { Text("GFG | Remove TextField Padding", color = Color.White) }, backgroundColor = Color(0xff0f9d58)) },
                content = {

                    // Creating a Column View
                    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                        // Declaring variables for two TextField Values
                        var mInput1 by remember{ mutableStateOf("")}
                        var mInput2 by remember{ mutableStateOf("")}

                        // Creating a Regular TextField
                        Text("Padded TextField")
                        TextField(
                            value = mInput1,
                            onValueChange = { mInput1 = it }
                        )

                        // Adding a Space of 100dp
                        Spacer(modifier = Modifier.height(100.dp))

                        // Creating a Non-Padded/Basic TextField
                        Text("Non-Padded/Basic TextField")
                        BasicTextField(
                            value = mInput2,
                            onValueChange = { mInput2 = it }
                        )
                    }
                }
            )
        }
    }
}
