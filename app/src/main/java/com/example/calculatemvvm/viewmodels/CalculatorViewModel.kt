package com.example.calculatemvvm.viewmodels

import android.app.Application
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.calculatemvvm.R
import com.example.calculatemvvm.models.Calculator
import com.example.calculatemvvm.models.Operator

class CalculatorViewModel(application: Application) : AndroidViewModel(application) {

    val calculator = Calculator(0F, 0F)
    var result: MutableLiveData<Int> = MutableLiveData()
    var temp = 0
    fun onClick(view: View) {
        when (view.id) {
            R.id.btn_zero -> result.value = 0
            R.id.btn_one -> result.value = 1
            R.id.btn_two -> result.value = 2
            R.id.btn_three -> result.value = 3
            R.id.btn_four -> result.value = 4
            R.id.btn_fine -> result.value = 5
            R.id.btn_six -> result.value = 6
            R.id.btn_seven -> result.value = 7
            R.id.btn_eight -> result.value = 8
            R.id.btn_nine -> result.value = 9
            R.id.btn_add -> {
               temp = result.value!!
               calculator.sum()
            }
            R.id.btn_sub -> {
                temp = result.value!!
                calculator.minus()
            }
            R.id.btn_multi -> {
                temp = result.value!!
                calculator.multi()
            }
            R.id.btn_divine -> {
                temp = result.value!!
                calculator.divine()
            }
            R.id.btn_mod -> {
                temp = result.value!!
                calculator.modulo()
            }
            R.id.btn_squareroot -> {
                temp = result.value!!
                calculator.squareRoot()
            }
            R.id.btn_ac -> {
                temp = 0
                result.value = 0
            }
            R.id.btn_del -> result.value = 0
            R.id.btn_equal -> result.value = calculator.printNumber(temp.toFloat(),result.value!!.toFloat()).toInt()
        }
    }

    fun getKetQuaCuoi(): MutableLiveData<Int> {
        return result
    }

}