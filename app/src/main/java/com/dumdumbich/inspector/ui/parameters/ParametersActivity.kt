package com.dumdumbich.inspector.ui.parameters

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
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

        adapter= ParametersAdapter()
/*
        adapter = ParametersAdapter(object:OnItemClickListener{
            override fun onItemClick(parameterItem: ParameterItem) {

            }
        })
*/
        ui.mainRecycler.adapter = adapter
        viewModel = ViewModelProvider(this).get(ParametersViewModel::class.java)
        viewModel.viewState().observe(this, { state ->
            state?.let { adapter.parameterItems = state.parameterItems }
        })
    }

//    private fun openParameterActivity(parameterItem: ParameterItem?){
//        val intent=ParameterActivity.getStartIntent(this,parameterItem)
//        startActivity(intent)
//    }
}