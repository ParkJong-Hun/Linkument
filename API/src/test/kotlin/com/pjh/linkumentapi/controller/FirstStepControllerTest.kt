package com.pjh.linkumentapi.controller

import com.pjh.linkumentapi.dto.UserResponseDto
import com.pjh.linkumentapi.entity.User
import com.pjh.linkumentapi.service.UserService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.atLeastOnce
import org.mockito.Mockito.verify
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest
import java.time.LocalDateTime

@RestClientTest
class FirstStepControllerTest {
    @InjectMocks
    private lateinit var firstStepController: FirstStepController

    @Mock
    private lateinit var userService: UserService

    @Test
    fun addUser() {
        Mockito
            .`when`(userService.registerUser("mock"))
            .thenReturn(
                User(
                    id = 0,
                    nickname = "mock",
                    createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                    updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                )
            )

        val response = firstStepController.addUser("mock")

        verify(userService, atLeastOnce())
        assertEquals(
            UserResponseDto(
                User(
                    id = 0,
                    nickname = "mock",
                    createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                    updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                )
            ),
            response
        )
    }

    @Test
    fun getUser() {
        Mockito
            .`when`(userService.getUserByNickname("mock"))
            .thenReturn(
                User(
                    id = 0,
                    nickname = "mock",
                    createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                    updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                )
            )

        val response = firstStepController.getUser("mock")

        verify(userService, atLeastOnce())
        assertEquals(
            UserResponseDto(
                User(
                    id = 0,
                    nickname = "mock",
                    createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                    updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                )
            ),
            response
        )
    }

    @Test
    fun deleteUser() {
        Mockito
            .`when`(userService.getUserByNickname("mock"))
            .thenReturn(
                User(
                    id = 0,
                    nickname = "mock",
                    createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                    updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                )
            )

        val response = firstStepController.deleteUser("mock")

        verify(userService, atLeastOnce())
        assertEquals(
            UserResponseDto(
                User(
                    id = 0,
                    nickname = "mock",
                    createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                    updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                )
            ),
            response
        )
    }
}