package com.example.up02_zd1

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.content.Intent
import android.media.Image
import android.widget.ImageView

class MainScreenActivity : ComponentActivity() {
    private lateinit var imgBtnDis: ImageView
    private lateinit var imgBtnFav: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        imgBtnDis = findViewById(R.id.img_enter)
        imgBtnFav = findViewById(R.id.img_enter_fav)

        imgBtnDis.setOnClickListener{
            startActivity(Intent(this, CharListScreenActivity::class.java))
            finish()
        }

        imgBtnFav.setOnClickListener{
            startActivity(Intent(this, MoviesScreenActivity::class.java))
            finish()
        }
    }
}