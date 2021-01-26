package com.dumdumbich.inspector.ui.parameters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dumdumbich.inspector.databinding.ActivityParametersBinding


class ParametersActivity : AppCompatActivity() {

    lateinit var ui: ActivityParametersBinding
    lateinit var viewModel: ParametersViewModel
    lateinit var adapter: ParametersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityParametersBinding.inflate(LayoutInflater.from(this))
        setContentView(ui.root)
        setSupportActionBar(ui.toolbar)
        viewModel = ViewModelProvider(this).get(ParametersViewModel::class.java)
        adapter = ParametersAdapter()
        ui.mainRecycler.adapter = adapter
        viewModel.viewState().observe(this, Observer<ParametersViewState> { state ->
            state?.let { adapter.parameters = state.parameters }
        })
    }
}