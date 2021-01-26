package com.dumdumbich.inspector.ui.parameters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dumdumbich.inspector.data.source.Repository

class ParametersViewModel : ViewModel() {

    private val viewStateLiveData: MutableLiveData<ParametersViewState> = MutableLiveData()

    init {
        viewStateLiveData.value = ParametersViewState(Repository.parameters)
    }

    fun viewState(): LiveData<ParametersViewState> = viewStateLiveData

}