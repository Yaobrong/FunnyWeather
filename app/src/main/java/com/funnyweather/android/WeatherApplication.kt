package com.funnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * MVVM全局获取配置
 */

class WeatherApplication : Application() {

    companion object {
        const val TOKEN = "UjVZgWFVfRSll62d"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}