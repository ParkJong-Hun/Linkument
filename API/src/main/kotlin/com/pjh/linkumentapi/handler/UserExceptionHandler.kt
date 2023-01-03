package com.pjh.linkumentapi.handler

import com.pjh.linkumentapi.controller.FirstStepController
import com.pjh.linkumentapi.dto.ExceptionResponseDto
import com.pjh.linkumentapi.exception.user.UserIdNotFoundException
import com.pjh.linkumentapi.exception.user.UserNicknameDuplicatedException
import com.pjh.linkumentapi.exception.user.UserNicknameNotFoundException
import org.springframework.context.MessageSource
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.util.*
import java.util.logging.Logger

@RestControllerAdvice(
    assignableTypes = [
        FirstStepController::class
    ]
)
class UserExceptionHandler(
    private val messageSource: MessageSource
) : ResponseEntityExceptionHandler() {

    @ExceptionHandler(UserIdNotFoundException::class)
    fun handleUserIdNotFound(
        exception: UserIdNotFoundException,
        request: WebRequest
    ): ResponseEntity<Any> {
        val response =
            ExceptionResponseDto(
                "[${exception.happenedTime}]" +
                        "${exception.targetId}: " +
                        getMessage("error.user.id.not-found")
            )
        return handleExceptionInternal(exception, response, HttpHeaders(), HttpStatus.NOT_FOUND, request)
    }

    @ExceptionHandler(UserNicknameNotFoundException::class)
    fun handleUserNicknameNotFound(
        exception: UserNicknameNotFoundException,
        request: WebRequest
    ): ResponseEntity<Any> {
        val response =
            ExceptionResponseDto(
                "[${exception.happenedTime}]" +
                        "${exception.targetNickname}: " +
                        getMessage("error.user.nickname.not-found")
            )
        return handleExceptionInternal(exception, response, HttpHeaders(), HttpStatus.NOT_FOUND, request)
    }

    @ExceptionHandler(UserNicknameDuplicatedException::class)
    fun handleUserNicknameDuplicated(
        exception: UserNicknameDuplicatedException,
        request: WebRequest
    ): ResponseEntity<Any> {
        val response =
            ExceptionResponseDto(
                "[${exception.happenedTime}]" +
                        "${exception.duplicatedValue}: " +
                        getMessage("error.user.nickname.duplicated")
            )
        return handleExceptionInternal(exception, response, HttpHeaders(), HttpStatus.MULTI_STATUS, request)
    }

    override fun handleExceptionInternal(
        ex: Exception,
        body: Any?,
        headers: HttpHeaders,
        statusCode: HttpStatusCode,
        request: WebRequest
    ): ResponseEntity<Any> {
        if (statusCode.is5xxServerError) Logger.getLogger(ex.message)
        return super.handleExceptionInternal(ex, body, headers, statusCode, request)!!
    }
    fun getMessage(key: String) = messageSource.getMessage(key, null, Locale.ENGLISH)
}