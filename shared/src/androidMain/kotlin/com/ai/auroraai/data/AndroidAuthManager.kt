package com.ai.auroraai.data

import com.ai.auroraai.domain.AuthManager
import com.google.firebase.auth.FirebaseAuth

class AndroidAuthManager : AuthManager {
    private val auth: FirebaseAuth
        get() = FirebaseAuth.getInstance()

    override fun signIn(
        email: String,
        password: String,
        onResult: (Boolean, String?) -> Unit
    ) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    onResult(true, null)
                } else {
                    onResult(false, task.exception?.localizedMessage ?: "Authentication failed")
                }
            }
    }
}