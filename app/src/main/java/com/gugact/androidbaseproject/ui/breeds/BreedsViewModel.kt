package com.gugact.androidbaseproject.ui.breeds

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.gugact.androidbaseproject.data.model.DogBreeds
import com.gugact.androidbaseproject.data.repository.DogRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class BreedsViewModel @Inject constructor(
    repository: DogRepository
) : ViewModel() {

    val breedsList = flow {
        emit(repository.breeds())
    }.asLiveData()

}