package com.funnyweather.android.logic.dao

import android.content.Context
import com.funnyweather.android.WeatherApplication
import com.funnyweather.android.logic.model.Place
import androidx.core.content.edit
import com.google.gson.Gson

object PlaceDao {
    private fun sharedPreferences() =
        WeatherApplication.context.getSharedPreferences("funny_weather", Context.MODE_PRIVATE)

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

}