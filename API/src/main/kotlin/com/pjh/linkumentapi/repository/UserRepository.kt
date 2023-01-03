package com.pjh.linkumentapi.repository

import com.pjh.linkumentapi.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    fun findByNicknameEquals(nickname: String): User?
}