package com.example.calculator.ui.model

sealed class Operations(val symbol: String) {
    object Add: Operations("+")
    object Sub: Operations("-")
    object Mult: Operations("*")
    object Divide: Operations("/")
}
