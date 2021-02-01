package com.dumdumbich.inspector.ui.facility

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dumdumbich.inspector.R
import com.dumdumbich.inspector.data.model.EntityElement
import com.dumdumbich.inspector.databinding.ElementEntityBinding

class FacilityAdapter : RecyclerView.Adapter<FacilityAdapter.FacilityViewHolder>() {

    var facilityElements: List<EntityElement> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacilityViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.element_entity, parent, false)
        return FacilityViewHolder(view)
    }

    override fun onBindViewHolder(holder: FacilityViewHolder, position: Int) {
        holder.bind(facilityElements[position])
    }

    override fun getItemCount() = facilityElements.size

    class FacilityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val ui: ElementEntityBinding = ElementEntityBinding.bind(itemView)

        fun bind(entityElement: EntityElement) {
            ui.entityName.text = entityElement.name
            ui.entityValue.text = entityElement.value
        }
    }

}