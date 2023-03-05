package com.pjh.linkument_android_app.feature.firststep.login

sealed interface LoginUiState {
    object None : LoginUiState

    object Loading : LoginUiState

    object LoggedIn : LoginUiState

    data class Error(
        // FIXME temporary. to non-null
        val throwable: Throwable?
    ) : LoginUiState
}