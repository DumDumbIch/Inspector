package com.dumdumbich.inspector.ui.main

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dumdumbich.inspector.data.model.Parameter


class MainAdapter: RecyclerView.Adapter<ParameterViewHolder> {

    var parameters:List<Parameter> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParameterViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ParameterViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = parameters.size

}