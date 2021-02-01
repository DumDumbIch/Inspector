package com.dumdumbich.inspector.ui.facility

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dumdumbich.inspector.data.source.FacilityRepository

class FacilityViewModel : ViewModel() {

    private val viewStateLiveData: MutableLiveData<FacilityViewState> = MutableLiveData()

    init {
        viewStateLiveData.value = FacilityViewState(FacilityRepository.facilityElements)
    }

    fun viewState(): LiveData<FacilityViewState> = viewStateLiveData

}