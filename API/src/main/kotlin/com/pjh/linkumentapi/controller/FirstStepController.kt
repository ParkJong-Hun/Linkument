package com.pjh.linkumentapi.controller

import com.pjh.linkumentapi.service.UserService
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstStepController(
    val userService: UserService
) {
    // TODO
}