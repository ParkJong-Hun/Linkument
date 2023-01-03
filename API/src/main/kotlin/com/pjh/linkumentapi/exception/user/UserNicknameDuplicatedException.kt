package com.pjh.linkumentapi.exception.user

import com.pjh.linkumentapi.exception.DuplicatedException
import java.time.LocalDateTime

data class UserNicknameDuplicatedException(
    override val duplicatedValue: String,
    override val happenedTime: LocalDateTime
) : RuntimeException(), DuplicatedException