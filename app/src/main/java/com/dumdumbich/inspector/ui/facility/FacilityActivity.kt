package com.dumdumbich.inspector.ui.facility

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dumdumbich.inspector.databinding.ActivityFacilityBinding

class FacilityActivity : AppCompatActivity() {

    lateinit var ui: ActivityFacilityBinding
    lateinit var viewModel: FacilityViewModel
    lateinit var adapter: FacilityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityFacilityBinding.inflate(LayoutInflater.from(this))
        setContentView(ui.root)
        setSupportActionBar(ui.toolbar)
        viewModel = ViewModelProvider(this).get(FacilityViewModel::class.java)
        adapter = FacilityAdapter()
        ui.mainRecycler.adapter = adapter
        viewModel.viewState().observe(this, Observer<FacilityViewState> { state ->
            state?.let { adapter.facilityElements = state.facilityElements }
        })
    }

}