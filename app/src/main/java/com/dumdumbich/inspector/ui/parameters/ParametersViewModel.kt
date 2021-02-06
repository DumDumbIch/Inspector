package com.dumdumbich.inspector.ui.parameters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dumdumbich.inspector.data.repository.BoilerPlantRepository

class ParametersViewModel : ViewModel() {

    private val viewStateLiveData: MutableLiveData<ParametersViewState> = MutableLiveData()

    init {
        viewStateLiveData.value = ParametersViewState(BoilerPlantRepository.parameterItems)
    }

    fun viewState(): LiveData<ParametersViewState> = viewStateLiveData

}