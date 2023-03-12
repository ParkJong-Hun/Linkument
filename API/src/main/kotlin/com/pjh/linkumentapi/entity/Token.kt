package com.pjh.linkumentapi.entity

import jakarta.persistence.Entity

@Entity
data class Token(
    val token: String,
)