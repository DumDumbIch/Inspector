package com.dumdumbich.inspector.ui.facilities

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dumdumbich.inspector.data.source.FacilitiesRepository

class FacilitiesViewModel : ViewModel() {

    private val viewStateLiveData: MutableLiveData<FacilitiesViewState> = MutableLiveData()

    init {
        viewStateLiveData.value = FacilitiesViewState(FacilitiesRepository.facilityCards)
    }

    fun viewState(): LiveData<FacilitiesViewState> = viewStateLiveData

}