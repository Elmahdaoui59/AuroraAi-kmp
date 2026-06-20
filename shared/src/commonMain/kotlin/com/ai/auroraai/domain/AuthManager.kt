package com.ai.auroraai.domain

interface AuthManager {
    fun signIn(email: String, password: String, onResult: (Boolean, String?) -> Unit)
}