package com.pjh.linkument_android_app.core.repository

import com.pjh.linkument_android_app.data.data.service.FirststepApiService
import com.pjh.linkument_android_app.data.model.UserEntity
import com.pjh.linkument_android_app.data.data.RetrofitClient
import com.pjh.linkument_android_app.data.data.repository.FirstStepRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

// TODO inject
class FirststepRepositoryImpl(
    private val api: FirststepApiService = RetrofitClient(),
) : FirstStepRepository {
    private val ioDispatcher = Dispatchers.IO
    private val ioScope = CoroutineScope(ioDispatcher)

    override suspend fun login(nickname: String): Boolean {
        val response = getUser(nickname)
        return response.isSuccessful
    }

    // FIXME won't this be necessary?
    override suspend fun checkUserExist(nickname: String): Boolean {
        val response = getUser(nickname)
        return response.isSuccessful
    }

    override suspend fun signUp(nickname: String): Boolean {
        val response = withContext(ioDispatcher) { api.addUser(nickname) }
        return response.isSuccessful
    }

    private suspend fun getUser(nickname: String): Response<UserEntity> {
        return withContext(ioDispatcher) {
            api.getUser(nickname)
        }
    }
}