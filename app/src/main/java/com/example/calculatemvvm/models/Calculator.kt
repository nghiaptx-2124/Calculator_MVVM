package com.example.calculatemvvm.models

import kotlin.math.sqrt

class Calculator(firstValue: Float, secondValue: Float) {
    var operator = Operator.EQUAL
    var firstValue: Float
    var secondValue: Float

    init {
        this.firstValue = firstValue
        this.secondValue = secondValue
    }

    fun sum() {
        operator = Operator.ADD
    }

    fun minus() {
        operator = Operator.SUB
    }

    fun multi() {
        operator = Operator.MULTIPLICATION

    }

    fun divine() {
        operator = Operator.DIVINE
    }

    fun modulo() {
        operator = Operator.MODULE

    }

    fun squareRoot() {
        operator = Operator.SQUARE_ROOT
    }

    fun clear() {
        this.firstValue = 0F
        this.secondValue = 0F
    }

    fun printNumber(firstValue: Float, secondValue: Float): Float {
        when (operator) {
            Operator.ADD -> return firstValue + secondValue
            Operator.DIVINE -> return firstValue / secondValue
            Operator.SUB -> return firstValue - secondValue
            Operator.MODULE -> return firstValue.rem(secondValue)
            Operator.SQUARE_ROOT -> return sqrt(firstValue)
            Operator.MULTIPLICATION -> return firstValue * secondValue
            else -> return secondValue
        }
    }

}