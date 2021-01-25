package com.dumdumbich.inspector.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dumdumbich.inspector.R
import com.dumdumbich.inspector.data.model.Parameter


class MainAdapter : RecyclerView.Adapter<MainAdapter.ParameterViewHolder>() {

    var parameters: List<Parameter> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParameterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_parameter, parent, false)
        return ParameterViewHolder(view)
    }

    override fun onBindViewHolder(holder: ParameterViewHolder, position: Int) {
        holder.bind(parameters[position])
    }

    override fun getItemCount(): Int = parameters.size


    class ParameterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val name =  itemView.findViewById<TextView>(R.id.parameter_name)
        private val value = itemView.findViewById<TextView>(R.id.parameter_value)

        fun bind(parameter: Parameter) {
            name.text = parameter.name
            value.text = parameter.value.toString()
            itemView.setBackgroundColor(parameter.color)
        }
    }

}