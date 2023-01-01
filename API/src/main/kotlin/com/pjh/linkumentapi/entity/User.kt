package com.pjh.linkumentapi.entity

import jakarta.persistence.Entity
import java.time.LocalDateTime

// FIXME
@Entity
data class User(
    val id: String,
    val nickname: String,
    val createTime: LocalDateTime,
)