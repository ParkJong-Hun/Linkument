package com.pjh.linkumentapi.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
    val nickname: String,
    @CreationTimestamp val createTime: LocalDateTime = LocalDateTime.now(),
    @UpdateTimestamp val updateTime: LocalDateTime = LocalDateTime.now()
)