package com.chapter8.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.chapter8.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                    Column() {
                        ButtumCustom(title = "Button Empat", color = Color.Red)
                        ButtumCustom(title = "Button Lima", color = Color.Blue)
                        ButtumCustom(title = "Button Enam", color = Color.Green)
                    }
                }
            }
        }
    }
}

@Composable
fun ButtumCustom(title : String, color: Color){
    Button(
        onClick = {},
        modifier = Modifier.padding(10.dp),
        colors = ButtonDefaults.buttonColors(color)
    ) {
        Text(text = title)
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier
        .border(width = 2.dp, color = Red)
        .padding(15.dp)
        .fillMaxWidth()
        .height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello $name!",
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
        )
        Text(
            text = "Text Kedua",
            modifier = Modifier.fillMaxWidth(),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(15.dp))

        Button(onClick = {},
            modifier = Modifier
                .border(width = 2.dp, color = Color.Red)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Gray)
//            ButtonDefaults.buttonColors(Color.GRAY)
        ) {
            Text(text = "Simpan")
        }

        Row() {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Butto 2")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 3")
            }
            Column() {
                Text(text = "Text 1")
                Text(text = "Text 2")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}