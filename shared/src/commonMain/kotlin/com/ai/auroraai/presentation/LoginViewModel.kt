package com.ai.auroraai.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ai.auroraai.domain.AuthManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LoginViewModel(private val authManager: AuthManager): ViewModel() {
    private val _uiState = MutableStateFlow<String>("Idle")
    val uiState: StateFlow<String> = _uiState

    fun login(email: String, password: String) {
        _uiState.value = "Loading..."

        viewModelScope.launch {
            authManager.signIn(email, password) { success, errorMessage ->
                if (success) {
                    _uiState.value = "Success! Logged in."
                } else {
                    _uiState.value = "Error: ${errorMessage ?: "Unknown error"}"
                }
            }
        }
    }
}