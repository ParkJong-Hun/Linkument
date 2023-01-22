package com.pjh.linkument_android_app.feature.firststep

interface FirstStepRepository {
    fun login(id: String)

    fun checkId(id: String)

    fun signUp(id: String)
}
