package com.pjh.linkumentapi.controller

import com.pjh.linkumentapi.dto.UserResponseDto
import com.pjh.linkumentapi.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class FirstStepController(
    val userService: UserService
) {
    @PostMapping("/firststep/{nickname}")
    @ResponseStatus(HttpStatus.CREATED)
    fun addUser(
        @PathVariable("nickname") nickname: String
    ): UserResponseDto {
        val newUser = userService.registerUser(nickname)
        return UserResponseDto(newUser)
    }

    @GetMapping("/firststep/{nickname}")
    @ResponseStatus(HttpStatus.OK)
    fun getUser(
        @PathVariable("nickname") nickname: String
    ): UserResponseDto {
        val targetUser = userService.getUserByNickname(nickname)
        return UserResponseDto(targetUser)
    }

    @DeleteMapping("/firststep/{nickname}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteUser(
        @PathVariable("nickname") nickname: String
    ): UserResponseDto {
        val targetUser = userService.getUserByNickname(nickname)
        return UserResponseDto(targetUser)
    }
}