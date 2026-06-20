package com.ai.auroraai

import androidx.compose.ui.window.ComposeUIViewController
import com.ai.auroraai.presentation.App
import kotlinx.cinterop.ExperimentalForeignApi
import swiftPMImport.AuroraAi.shared.FIRApp

@OptIn(ExperimentalForeignApi::class)
fun MainViewController() = ComposeUIViewController {
    FIRApp.configure()
    App()
}