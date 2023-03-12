package com.pjh.linkumentapi.service

import com.pjh.linkumentapi.entity.AuthInfo
import com.pjh.linkumentapi.entity.Token
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class TokenService {
    // TODO
    fun generateToken(authInfo: AuthInfo): Token? {
        // TODO
        return null
    }

    private fun encryption(authInfo: AuthInfo): Token {
        return Token("")
    }

    fun getAuthInfo(token: Token): AuthInfo? {
        // TODO
        return null
    }

    private fun decryption(token: Token): AuthInfo {
        // TODO
        return AuthInfo()
    }

    fun updateToken(token: Token): Token? {
        // TODO
        return null
    }
}