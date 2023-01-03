package com.pjh.linkumentapi.entity

import jakarta.persistence.Entity
import java.time.LocalDateTime

@Entity
data class User(
    val id: Long?,
    val nickname: String,
    val createTime: LocalDateTime = LocalDateTime.now(),
    val updateTime: LocalDateTime = LocalDateTime.now()
)