package com.example.calculatemvvm.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.calculatemvvm.R
import com.example.calculatemvvm.databinding.ActivityMainBinding
import com.example.calculatemvvm.viewmodels.CalculatorViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var calculatorViewModel: CalculatorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityGameBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
            )
        calculatorViewModel = ViewModelProviders.of(this).get(CalculatorViewModel::class.java)
        calculatorViewModel.getKetQuaCuoi().observe(this, Observer { txt_kq.text = "$it" })
        activityGameBinding.calculatorViewModel = calculatorViewModel
    }
}
