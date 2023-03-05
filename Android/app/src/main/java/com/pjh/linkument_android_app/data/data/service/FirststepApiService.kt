package com.pjh.linkument_android_app.data.data.service

import com.pjh.linkument_android_app.data.model.UserEntity
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface FirststepApiService {
    @POST("/firststep/{nickname}")
    suspend fun addUser(@Path("nickname") nickname: String): Response<UserEntity>

    @GET("/firststep/{nickname}")
    suspend fun getUser(@Path("nickname") nickname: String): Response<UserEntity>
}