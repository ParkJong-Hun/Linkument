package com.pjh.linkument_android_app.feature.firststep

interface FirstStepRepository {
    suspend fun login(nickname: String): Boolean

    suspend fun checkUserExist(nickname: String): Boolean

    suspend fun signUp(nickname: String): Boolean
}
