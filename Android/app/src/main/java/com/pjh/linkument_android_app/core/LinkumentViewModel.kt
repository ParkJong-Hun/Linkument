package com.pjh.linkument_android_app.core

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class LinkumentViewModel : ViewModel() {
    private val _appState = MutableStateFlow(LinkumentAppState.None)
    val appState : StateFlow<LinkumentAppState> get() = _appState
}