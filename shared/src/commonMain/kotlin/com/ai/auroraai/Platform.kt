package com.ai.auroraai

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform