package com.pjh.linkumentapi.exception

import java.time.LocalDateTime

data class UserIdNotFoundException(
    override val requestId: Long,
    override val happenedTime: LocalDateTime
) : RuntimeException(), IdNotFoundException