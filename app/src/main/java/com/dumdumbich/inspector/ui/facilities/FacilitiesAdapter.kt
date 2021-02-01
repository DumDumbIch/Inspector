package com.dumdumbich.inspector.ui.facilities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dumdumbich.inspector.R
import com.dumdumbich.inspector.data.model.FacilityCard
import com.dumdumbich.inspector.databinding.CardFacilityBinding
import com.dumdumbich.inspector.ui.utils.ColorsToView

class FacilitiesAdapter : RecyclerView.Adapter<FacilitiesAdapter.FacilityViewHolder>() {

    var facilityCards: List<FacilityCard> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacilityViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.card_facility, parent, false)
        return FacilityViewHolder(view)
    }

    override fun onBindViewHolder(holder: FacilityViewHolder, position: Int) {
        holder.bind(facilityCards[position])
    }

    override fun getItemCount() = facilityCards.size

    class FacilityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val ui: CardFacilityBinding = CardFacilityBinding.bind(itemView)

        fun bind(facilityCard: FacilityCard) {
            ui.facilityName.text = facilityCard.name
            ui.facilityAddress.text = facilityCard.address
            itemView.setBackgroundResource(ColorsToView.assign(facilityCard.color))
        }
    }

}