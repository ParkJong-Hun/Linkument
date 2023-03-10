package com.pjh.linkument_android_app.feature.firststep.login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pjh.linkument_android_app.data.data.repository.FirstStepRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val firstStepRepository: FirstStepRepository
) : ViewModel() {
    private val _uiState = MutableStateFlow<LoginUiState>(LoginUiState.None)
    val uiState: StateFlow<LoginUiState> get() = _uiState

    fun login(nickname: String) {
        viewModelScope.launch {
            _uiState.value = LoginUiState.Loading
            if (firstStepRepository.login(nickname)) {
                _uiState.value = LoginUiState.LoggedIn
            } else {
                _uiState.value = LoginUiState.Error(throwable = null)
            }
        }
    }
}