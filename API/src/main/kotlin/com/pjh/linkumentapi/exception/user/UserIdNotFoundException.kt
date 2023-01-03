package com.pjh.linkumentapi.exception.user

import com.pjh.linkumentapi.exception.IdNotFoundException
import java.time.LocalDateTime

data class UserIdNotFoundException(
    override val targetId: Long,
    override val happenedTime: LocalDateTime
) : RuntimeException(), IdNotFoundException