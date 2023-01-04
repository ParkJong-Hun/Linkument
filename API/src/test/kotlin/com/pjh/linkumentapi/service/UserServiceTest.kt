package com.pjh.linkumentapi.service

import com.pjh.linkumentapi.entity.User
import com.pjh.linkumentapi.repository.UserRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDateTime

@SpringBootTest
internal class UserServiceTest {
    @InjectMocks
    private lateinit var userService: UserService

    @Mock
    private lateinit var userRepository: UserRepository

    @Test
    fun findUserById() {
        Mockito
            .`when`(userRepository.findByNicknameEquals("mock"))
            .thenReturn(
                User(
                    id = 0,
                    nickname = "mock",
                    createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                    updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                )
            )

        val user = userService.findUserByNickname("mock")

        assertEquals(0L, user?.id)
        assertEquals("mock", user?.nickname)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user?.createTime)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user?.updateTime)
    }

    @Test
    fun findUserByNickname() {
    }

    @Test
    fun getUserById() {
    }

    @Test
    fun getUserByNickname() {
    }

    @Test
    fun registerUser() {
    }

    @Test
    fun deleteUser() {
    }

    @Test
    fun getRepository() {
    }
}