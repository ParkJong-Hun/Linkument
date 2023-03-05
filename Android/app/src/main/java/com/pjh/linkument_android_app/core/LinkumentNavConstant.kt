package com.pjh.linkument_android_app.core

sealed interface LinkumentNavConstant {
    val graphName: String

    object FirstStep : LinkumentNavConstant {
        override val graphName = "FirsStep"
        const val LoginRoute = "LoginRoute"
        const val SignUpRoute = "SignUpRoute"
    }

    object Home : LinkumentNavConstant {
        override val graphName = "Home"
        const val HomeRoute = "HomeRoute"
    }
}