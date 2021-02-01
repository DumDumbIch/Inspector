package com.dumdumbich.inspector.ui.facilities

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dumdumbich.inspector.databinding.ActivityFacilitiesBinding

class FacilitiesActivity : AppCompatActivity() {

    lateinit var ui: ActivityFacilitiesBinding
    lateinit var viewModel: FacilitiesViewModel
    lateinit var adapter: FacilitiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityFacilitiesBinding.inflate(LayoutInflater.from(this))
        setContentView(ui.root)
        setSupportActionBar(ui.toolbar)
        viewModel = ViewModelProvider(this).get(FacilitiesViewModel::class.java)
        adapter = FacilitiesAdapter()
        ui.mainRecycler.adapter = adapter
        viewModel.viewState().observe(this, Observer<FacilitiesViewState> { state ->
            state?.let { adapter.facilityCards = state.facilityCards }
        })
    }

}