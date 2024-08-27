package com.example.photopickerbm

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType.Companion.Uri
import androidx.compose.ui.tooling.preview.Preview
import com.example.photopickerbm.ui.theme.PhotoPIckerBMTheme

class ImageEffectActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PhotoPIckerBMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   val effect = intent.getStringExtra("effect")
                    val pic = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
                        intent.getParcelableExtra("picture" , Uri::class.java)
                    }
                    else{
                        intent.getParcelableExtra("picture")
                    }

                }
            }
        }
    }
}

