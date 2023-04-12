package com.example.calculator_jetpackcompose.domain

sealed class CalculatorOperator(val symbol: String) {
    object Multiply: CalculatorOperator(symbol = "x")
    object Divide: CalculatorOperator(symbol = "÷")
    object Minus: CalculatorOperator(symbol = "-")
    object Plus: CalculatorOperator(symbol = "+")
}
