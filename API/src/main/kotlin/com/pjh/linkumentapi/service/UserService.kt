package com.pjh.linkumentapi.service

import com.pjh.linkumentapi.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserService(val repository: UserRepository) {
    // TODO
}