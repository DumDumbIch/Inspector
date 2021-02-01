package com.dumdumbich.inspector.ui.parameters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dumdumbich.inspector.R
import com.dumdumbich.inspector.data.model.ParameterCard
import com.dumdumbich.inspector.databinding.ItemParameterBinding


class ParametersAdapter : RecyclerView.Adapter<ParametersAdapter.ParameterViewHolder>() {

    var parameterCards: List<ParameterCard> = listOf()
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
        holder.bind(parameterCards[position])
    }

    override fun getItemCount(): Int = parameterCards.size

    class ParameterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ui: ItemParameterBinding = ItemParameterBinding.bind(itemView)

        fun bind(parameterCard: ParameterCard) {
            ui.parameterName.text = parameterCard.name
            ui.parameterValue.text = parameterCard.value.toString()
            itemView.setBackgroundColor(parameterCard.color)
        }
    }

}