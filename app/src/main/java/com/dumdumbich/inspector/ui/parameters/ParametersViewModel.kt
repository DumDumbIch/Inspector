package com.dumdumbich.inspector.ui.parameters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dumdumbich.inspector.data.source.ParametersRepository

class ParametersViewModel : ViewModel() {

    private val viewStateLiveData: MutableLiveData<ParametersViewState> = MutableLiveData()

    init {
        viewStateLiveData.value = ParametersViewState(ParametersRepository.parameterCards)
    }

    fun viewState(): LiveData<ParametersViewState> = viewStateLiveData

}