package com.ai.auroraai.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.ai.auroraai.data.createAuthManager

@Composable
@Preview
fun App() {
    val loginViewModel = remember {
        LoginViewModel(authManager = createAuthManager())
    }
    val loginState by loginViewModel.uiState.collectAsStateWithLifecycle()
    MaterialTheme {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text("Auth Status: $loginState")

            Button(onClick = {
                loginViewModel.login("example@gmail.com", "123456")
            }) {
                Text("Sign In")
            }

        }
    }
}