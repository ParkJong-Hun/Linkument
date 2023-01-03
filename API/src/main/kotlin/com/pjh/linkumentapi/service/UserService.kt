package com.pjh.linkumentapi.service

import com.pjh.linkumentapi.entity.User
import com.pjh.linkumentapi.exception.user.UserIdNotFoundException
import com.pjh.linkumentapi.exception.user.UserNicknameDuplicatedException
import com.pjh.linkumentapi.exception.user.UserNicknameNotFoundException
import com.pjh.linkumentapi.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime

@Service
@Transactional
class UserService(val repository: UserRepository) {
    fun findUserById(id: Long): User? {
        return repository.findById(id).orElse(null)
    }

    fun findUserByNickname(nickname: String): User? {
        return repository.findByNicknameEquals(nickname)
    }

    fun getUserById(id: Long): User {
        return findUserById(id) ?: throw UserIdNotFoundException(
            targetId = id,
            happenedTime = LocalDateTime.now()
        )
    }

    fun getUserByNickname(nickname: String): User {
        return findUserByNickname(nickname) ?: throw UserNicknameNotFoundException(
            targetNickname = nickname,
            happenedTime = LocalDateTime.now()
        )
    }

    fun registerUser(nickname: String): User {
        val newUser = User(null, nickname)
        if (findUserByNickname(nickname) != null) {
            throw UserNicknameDuplicatedException(
                duplicatedValue = nickname,
                happenedTime = LocalDateTime.now()
            )
        } else {
            return repository.save(newUser)
        }
    }

    fun deleteUser(nickname: String): User {
        val targetUser = getUserByNickname(nickname)
        repository.delete(targetUser)
        return targetUser
    }
}