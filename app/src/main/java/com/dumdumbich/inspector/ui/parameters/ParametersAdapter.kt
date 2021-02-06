package com.dumdumbich.inspector.ui.parameters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dumdumbich.inspector.R
import com.dumdumbich.inspector.data.model.ParameterItem
import com.dumdumbich.inspector.databinding.ItemParameterBinding
import com.dumdumbich.inspector.ui.utils.ColorsToView

interface OnItemClickListener {
    fun onItemClick(parameterItem: ParameterItem)
}

class ParametersAdapter() : RecyclerView.Adapter<ParametersAdapter.ParameterViewHolder>() {
//    private val onItemClickListener: OnItemClickListener
    var parameterItems: List<ParameterItem> = listOf()
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
        holder.bind(parameterItems[position])
    }

    override fun getItemCount(): Int = parameterItems.size

    inner class ParameterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ui: ItemParameterBinding = ItemParameterBinding.bind(itemView)

        fun bind(parameterItem: ParameterItem) {
            ui.parameterName.text = parameterItem.name
            ui.parameterValue.text = parameterItem.value.toString()
            itemView.setBackgroundResource(ColorsToView.assign(parameterItem.color))
//            itemView.setOnClickListener { onItemClickListener.onItemClick(parameterItem) }
        }
    }

}