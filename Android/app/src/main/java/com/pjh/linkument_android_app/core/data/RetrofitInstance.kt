package com.pjh.linkument_android_app.core.data

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BaseUrl = "http://localhost:8080"

    fun invoke() = Retrofit
        .Builder()
        .baseUrl(BaseUrl)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .build()
}