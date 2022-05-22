package com.gugact.androidbaseproject.ui.dachshund

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gugact.androidbaseproject.data.model.DogImage
import com.gugact.androidbaseproject.data.repository.DogRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DachshundViewModel @Inject constructor(
    val repository: DogRepository
) : ViewModel() {

    val dachshundImage = MutableLiveData<DogImage>()

    fun getDachshundImage() = viewModelScope.launch {
        dachshundImage.postValue(repository.dachshundImage())
    }

    init {
        getDachshundImage()
    }

}