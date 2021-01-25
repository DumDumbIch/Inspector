package com.dumdumbich.inspector.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.dumdumbich.inspector.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var ui: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(ui.root)
        ui.textParameter1.text = "Temperature outdoor"
        ui.textValue1.text = "-25"
        ui.textParameter2.text = "Temperature inside"
        ui.textValue2.text = "+20"
    }
}