package com.example.calculator_jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.calculator_jetpackcompose.presentation.calculator_screen.CalculatorScreen
import com.example.calculator_jetpackcompose.presentation.calculator_screen.CalculatorViewModel
import com.example.calculator_jetpackcompose.ui.theme.CalculatorJetpackComposeTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<CalculatorViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorJetpackComposeTheme {
                CalculatorScreen(viewModel = viewModel)
            }
        }
    }
}

