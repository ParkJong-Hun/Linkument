package com.pjh.linkumentapi.exception.token

data class TokenDoubleAccessException(
    val token: String,
    val nickname: String,
)