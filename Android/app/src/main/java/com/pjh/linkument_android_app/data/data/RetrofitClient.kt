package com.pjh.linkument_android_app.data.data

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    private const val BaseUrl = "http://localhost:8080"

    private fun b() = Retrofit.Builder()
        .baseUrl(BaseUrl)
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        .build()

    fun build() = b()

    inline operator fun <reified T> invoke() = build().create<T>()
}