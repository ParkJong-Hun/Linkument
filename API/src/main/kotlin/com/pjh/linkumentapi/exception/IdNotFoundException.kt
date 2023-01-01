package com.pjh.linkumentapi.exception

import java.time.LocalDateTime

interface IdNotFoundException {
    val requestId: Long
    val happenedTime: LocalDateTime
}