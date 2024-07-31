package com.funnyweather.android.logic.network

import com.funnyweather.android.WeatherApplication
import com.funnyweather.android.logic.model.DailyResponse
import com.funnyweather.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.6/${WeatherApplication.TOKEN}/{lng},{lat}/realtime")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    @GET("v2.6/${WeatherApplication.TOKEN}/{lng},{lat}/daily?dailysteps=3")
    fun getDailyWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<DailyResponse>
}