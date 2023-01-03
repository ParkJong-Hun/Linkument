package com.pjh.linkumentapi.exception

import java.time.LocalDateTime

interface DuplicatedException {
    val duplicatedValue: Any
    val happenedTime: LocalDateTime
}