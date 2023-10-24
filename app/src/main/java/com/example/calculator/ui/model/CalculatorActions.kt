package com.example.calculator.ui.model

sealed class CalculatorActions {

    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operation(val operations: Operations): CalculatorActions()
}
