package com.pjh.linkumentapi.exception

import java.time.LocalDateTime

interface IdNotFoundException {
    val targetId: Long
    val happenedTime: LocalDateTime
}