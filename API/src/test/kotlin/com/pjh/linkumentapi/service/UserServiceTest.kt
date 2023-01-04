package com.pjh.linkumentapi.service

import com.pjh.linkumentapi.entity.User
import com.pjh.linkumentapi.exception.user.UserIdNotFoundException
import com.pjh.linkumentapi.exception.user.UserNicknameDuplicatedException
import com.pjh.linkumentapi.exception.user.UserNicknameNotFoundException
import com.pjh.linkumentapi.repository.UserRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.mockito.ArgumentMatchers
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest
import java.time.LocalDateTime
import java.util.*

@RestClientTest
internal class UserServiceTest {
    @InjectMocks
    private lateinit var userService: UserService

    @Mock
    private lateinit var userRepository: UserRepository

    @Test
    fun findUserById() {
        Mockito
            .`when`(userRepository.findById(0))
            .thenReturn(
                Optional.of(
                    User(
                        id = 0,
                        nickname = "mock",
                        createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                        updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                    )
                )
            )

        val user = userService.findUserById(0)

        assertEquals(0L, user?.id)
        assertEquals("mock", user?.nickname)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user?.createTime)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user?.updateTime)
    }

    @Test
    fun findUserByNickname() {
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
    fun getUserById() {
        Mockito
            .`when`(userRepository.findById(0))
            .thenReturn(
                Optional.of(
                    User(
                        id = 0,
                        nickname = "mock",
                        createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                        updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                    )
                )
            )

        val user = userService.getUserById(0)

        assertEquals(0L, user.id)
        assertEquals("mock", user.nickname)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user.createTime)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user.updateTime)
        assertThrows<UserIdNotFoundException> { userService.getUserById(1) }
    }

    @Test
    fun getUserByNickname() {
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

        val user = userService.getUserByNickname("mock")

        assertEquals(0L, user.id)
        assertEquals("mock", user.nickname)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user.createTime)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user.updateTime)
        assertThrows<UserNicknameNotFoundException> { userService.getUserByNickname("incorrect") }
    }

    @Test
    fun registerUser() {
        Mockito
            .`when`(userRepository.findByNicknameEquals("mocknew"))
            .thenReturn(null)

        Mockito
            .`when`(userRepository.findByNicknameEquals("mockold"))
            .thenThrow(UserNicknameDuplicatedException("mockold", LocalDateTime.now()))

        Mockito
            .`when`(
                userRepository.save(ArgumentMatchers.any())
            )
            .thenReturn(
                User(
                    id = 1,
                    nickname = "mocknew",
                    createTime = LocalDateTime.of(2022, 11, 11, 11, 11),
                    updateTime = LocalDateTime.of(2022, 11, 11, 11, 11)
                )
            )

        val user = userService.registerUser("mocknew")

        assertEquals(1L, user.id)
        assertEquals("mocknew", user.nickname)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user.createTime)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user.updateTime)
        assertThrows<UserNicknameDuplicatedException> { userService.registerUser("mockold") }
    }

    @Test
    fun deleteUser() {
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

        val user = userService.deleteUser("mock")

        assertEquals(0, user.id)
        assertEquals("mock", user.nickname)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user.createTime)
        assertEquals(LocalDateTime.of(2022, 11, 11, 11, 11), user.updateTime)
    }
}