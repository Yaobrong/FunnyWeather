package com.funnyweather.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val window = window
        window.statusBarColor = resources.getColor(R.color.colorPrimary)

        setContentView(R.layout.activity_main)
    }
}