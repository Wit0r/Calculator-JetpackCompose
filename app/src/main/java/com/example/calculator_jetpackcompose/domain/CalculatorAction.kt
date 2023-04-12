package com.example.calculator_jetpackcompose.domain

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    data class Operator(val operator: CalculatorOperator): CalculatorAction()
    object Calculate: CalculatorAction()
    object Decimal: CalculatorAction()
    object Delete: CalculatorAction()
    object Clear: CalculatorAction()

}

