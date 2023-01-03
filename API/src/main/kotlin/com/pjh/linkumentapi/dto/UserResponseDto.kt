package com.pjh.linkumentapi.dto

import com.pjh.linkumentapi.entity.User
import java.time.LocalDateTime

data class UserResponseDto(
    val id: Long,
    val nickname: String,
    val createTime: LocalDateTime,
    val updateTime: LocalDateTime
) {
    constructor(
        user: User
    ) : this(
        user.id!!,
        user.nickname,
        user.createTime,
        user.updateTime
    )
}