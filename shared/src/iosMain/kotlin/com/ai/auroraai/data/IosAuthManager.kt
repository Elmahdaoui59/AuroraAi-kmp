package com.ai.auroraai.data

import com.ai.auroraai.domain.AuthManager
import kotlinx.cinterop.ExperimentalForeignApi
import swiftPMImport.AuroraAi.shared.FIRAuth

class IosAuthManager : AuthManager {
    @OptIn(ExperimentalForeignApi::class)
    override fun signIn(
        email: String,
        password: String,
        onResult: (Boolean, String?) -> Unit
    ) {
        FIRAuth.Companion.auth().signInWithEmail(email, password = password) { result, error ->
            if (error != null) {
                onResult(false, error.localizedDescription)
            } else {
                onResult(true, null)
            }
        }
    }
}