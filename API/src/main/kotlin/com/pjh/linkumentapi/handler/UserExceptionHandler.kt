package com.pjh.linkumentapi.handler

import com.pjh.linkumentapi.controller.FirstStepController
import org.springframework.context.MessageSource
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.util.*

@RestControllerAdvice(
    assignableTypes = [
        FirstStepController::class
    ]
)
class UserExceptionHandler(
    private val messageSource: MessageSource
) : ResponseEntityExceptionHandler() {

    // TODO

    fun getMessage(key: String) = messageSource.getMessage(key, null, Locale.ENGLISH)
}