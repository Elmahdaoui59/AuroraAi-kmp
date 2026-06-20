package com.ai.auroraai.data

import com.ai.auroraai.data.IosAuthManager
import com.ai.auroraai.domain.AuthManager

actual fun createAuthManager(): AuthManager {
    return IosAuthManager()
}