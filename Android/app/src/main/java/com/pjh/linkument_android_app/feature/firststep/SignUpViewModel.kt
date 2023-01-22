package com.pjh.linkument_android_app.feature.firststep

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val firstStepViewRepository: FirstStepRepository
) : ViewModel() {
    // TODO
    val uiState: StateFlow<SignUpUiState> = MutableStateFlow(SignUpUiState.None)

    fun checkId(id: String) {
        // FIXME may be wrong
        firstStepViewRepository.checkId(id)
    }

    fun signUp(id: String) {
        // FIXME may be wrong
        firstStepViewRepository.signUp(id)
    }
}

sealed interface SignUpUiState {
    object None : SignUpUiState

    object Loading : SignUpUiState

    object Success : SignUpUiState

    data class Error(
        val throwable: Throwable
    ) : SignUpUiState
}