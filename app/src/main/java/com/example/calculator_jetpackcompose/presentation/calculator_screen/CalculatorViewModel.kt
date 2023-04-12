package com.example.calculator_jetpackcompose.presentation.calculator_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.calculator_jetpackcompose.domain.CalculatorAction
import com.example.calculator_jetpackcompose.domain.CalculatorOperator
import com.example.calculator_jetpackcompose.domain.model.CalculatorState

class CalculatorViewModel : ViewModel() {

    var state by mutableStateOf(CalculatorState())

    fun onAction(action: CalculatorAction) {
        when (action) {
            is CalculatorAction.Number -> onNumber(action.number)
            is CalculatorAction.Operator -> onOperator(action.operator)
            is CalculatorAction.Calculate -> onCalculate()
            is CalculatorAction.Decimal -> onDecimal()
            is CalculatorAction.Delete -> onDelete()
            is CalculatorAction.Clear -> state = CalculatorState()
        }
    }

    private fun onNumber(number: Int) {
        if (state.operator == null) {
            if (state.number1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(number1 = state.number1 + number)
            return
        }
        if (state.number2.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(number2 = state.number2 + number)
    }

    private fun onOperator(operator: CalculatorOperator) {
        if (state.number1.isNotBlank()) state = state.copy(operator = operator)
    }

    private fun onCalculate() {
        val number1 = state.number1.toDoubleOrNull() ?: return
        val number2 = state.number2.toDoubleOrNull() ?: return
        val result = when (state.operator) {
            CalculatorOperator.Plus -> number1.plus(number2)
            CalculatorOperator.Minus -> number1.minus(number2)
            CalculatorOperator.Divide -> number1.div(number2)
            CalculatorOperator.Multiply -> number1.times(number2)
            null -> return
        }
        state = state.copy(
            number1 = result.toString().take(n = MAX_NUM_LENGTH),
            number2 = "",
            operator = null
        )
    }

    private fun onDecimal() {
        if (state.operator == null && !state.number1.contains(".") && state.number1.isNotBlank()) {
            state = state.copy(number1 = state.number1 + ".")
            return
        } else if (!state.number2.contains(".") && state.number2.isNotBlank()) {
            state = state.copy(number2 = state.number2 + ".")
        }
    }

    private fun onDelete() {
        when {
            state.number1.isNotBlank() -> state = state.copy(number1 = state.number1.dropLast(n = 1))
            state.number2.isNotBlank() -> state = state.copy(number2 = state.number2.dropLast(n = 1))
            state.operator != null -> state = state.copy(operator = null)
        }
    }

    companion object {
        private const val MAX_NUM_LENGTH = 14
    }
}