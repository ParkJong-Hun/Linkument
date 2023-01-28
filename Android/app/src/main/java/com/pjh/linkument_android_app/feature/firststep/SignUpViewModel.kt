package com.pjh.linkument_android_app.feature.firststep

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val firstStepViewRepository: FirstStepRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow<SignUpUiState>(SignUpUiState.None)
    val uiState: StateFlow<SignUpUiState> get() = _uiState

    fun checkId(id: String) {
        viewModelScope.launch {
            _uiState.value = SignUpUiState.Loading
            if (firstStepViewRepository.checkUserExist(id)) {
                _uiState.value = SignUpUiState.CheckValid
            } else {
                _uiState.value = SignUpUiState.Error(null)
            }
        }
    }

    fun signUp(id: String) {
        viewModelScope.launch {
            _uiState.value = SignUpUiState.Loading
            if (firstStepViewRepository.signUp(id)) {
                _uiState.value = SignUpUiState.Success
            } else {
                _uiState.value = SignUpUiState.Error(null)
            }
        }
    }
}