package com.dumdumbich.inspector.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dumdumbich.inspector.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var ui: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    lateinit var adapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(ui.root)
        setSupportActionBar(ui.toolbar)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        adapter = MainAdapter()
        ui.mainRecycler.adapter = adapter
        viewModel.viewState().observe(this, Observer<MainViewState> { state ->
            state?.let { adapter.parameters = state.parameters }
        })
    }
}