package com.pjh.linkumentapi.exception

import java.time.LocalDateTime

data class UserNicknameDuplicatedException(
    override val duplicatedValue: String,
    override val happenedTime: LocalDateTime
) : RuntimeException(), DuplicatedException