package com.pjh.linkumentapi.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class LinkumentWebConfig : WebMvcConfigurer {
    // TODO
    override fun addInterceptors(registry: InterceptorRegistry) {
        super.addInterceptors(registry)
    }
}