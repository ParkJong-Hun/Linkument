package com.pjh.linkument_android_app.feature.firststep

sealed interface SignUpUiState {
    object None : SignUpUiState

    object Loading : SignUpUiState

    object CheckValid : SignUpUiState

    object Success : SignUpUiState

    data class Error(
        // FIXME temporary. to non-null
        val throwable: Throwable?
    ) : SignUpUiState
}