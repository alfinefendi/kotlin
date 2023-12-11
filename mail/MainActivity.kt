package com.example.sayhi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sayhi.ui.theme.SayhiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var from: String = "Hideko"
        var title: String = "Selamat Sore"
        var content: String = "today im learning kotlin, and whatever we do, certainly is we doing some effort to achieve anything that we can do "
        var to: String = "Nanabe"
        setContent {
            SayhiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(from = from, title = title, content = content, to = to)
                }
            }
        }
    }
}



@Composable
fun GreetingText(from: String, title: String, content: String, to: String,modifier: Modifier = Modifier) {


    Column(modifier = modifier
        .background(Color.LightGray)
        .padding(20.dp)){
        Text(
            text = "from $from",
            fontSize = 14.sp
        )
        Text(
            text = title,
            fontSize = 30.sp
        )
        Text(
            text = content,
            fontSize = 16.sp
        ) 

    }

}
