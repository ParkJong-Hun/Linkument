package com.pjh.linkument_android_app.core

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class LinkumentViewModel @Inject constructor() : ViewModel() {
    private val _appState = MutableStateFlow<LinkumentAppState>(LinkumentAppState.None)
    val appState: StateFlow<LinkumentAppState> get() = _appState

    fun transition(newAppState: LinkumentAppState) {
        if (appState.value is LinkumentAppState.None) {
            if (appState.value is LinkumentAppState.IsLoggedIn) {
                _appState.value = newAppState
                return
            }
            return
        }
        Log.w(
            "TransitionFailure",
            "The transition method is failed.\nold: ${appState.value} new: $newAppState"
        )
    }
}