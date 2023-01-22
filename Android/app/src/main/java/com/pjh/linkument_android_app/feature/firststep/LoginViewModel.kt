package com.pjh.linkument_android_app.feature.firststep

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val firstStepRepository: FirstStepRepository
) : ViewModel() {
    // TODO
    val uiState: StateFlow<LoginUiState> = MutableStateFlow(LoginUiState.None)

    fun login(id: String) {
        // FIXME may be wrong
        firstStepRepository.login(id)
    }
}

sealed interface LoginUiState {
    object None : LoginUiState

    object Loading : LoginUiState

    object LoggedIn : LoginUiState

    data class Error(
        val throwable: Throwable
    ) : LoginUiState
}