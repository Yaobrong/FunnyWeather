package com.funnyweather.android.logic.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Retrofit构建器，单例
 */

object ServiceCreator {

    private const val BASE_URL = "https://api.caiyunapp.com/"
//    val client = OkHttpClient.Builder()
//        .addInterceptor { chain ->
//            val request = chain.request()
//            println("Request URL: ${request.url()}") // 打印请求的完整 URL
//            chain.proceed(request)
//        }
//        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
//        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)

    inline fun <reified T> create(): T = create(T::class.java)
}