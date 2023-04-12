package com.example.calculator_jetpackcompose.domain.model

import com.example.calculator_jetpackcompose.domain.CalculatorOperator

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operator: CalculatorOperator? = null
)
