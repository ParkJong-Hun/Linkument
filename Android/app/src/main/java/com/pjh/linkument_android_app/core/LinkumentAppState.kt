package com.pjh.linkument_android_app.core

sealed interface LinkumentAppState {
    object None : LinkumentAppState
    object IsLoggedIn : LinkumentAppState
}