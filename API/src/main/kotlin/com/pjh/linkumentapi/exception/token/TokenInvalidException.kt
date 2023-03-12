package com.pjh.linkumentapi.exception.token

data class TokenInvalidException(val token: String) : RuntimeException()