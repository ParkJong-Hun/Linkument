package com.pjh.linkumentapi.repository

import com.pjh.linkumentapi.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByIdEquals(id: Long): User?
    fun findByNicknameEquals(nickname: String): User?
}