package com.pjh.linkumentapi.exception.user

import java.time.LocalDateTime

data class UserNicknameNotFoundException(
    val targetNickname: String,
    val happenedTime: LocalDateTime
) : RuntimeException()