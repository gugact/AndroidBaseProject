package com.gugact.androidbaseproject.data.local

import androidx.lifecycle.MutableLiveData
import com.gugact.androidbaseproject.data.model.DogBreeds
import com.gugact.androidbaseproject.data.model.DogImage
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

class DogLocalDataSource @Inject constructor() {

    //TODO implement a valid localDataSource, for now we always return static data


    suspend fun breedList() = DogBreeds(
            mapOf(
                "dachshund" to emptyList(),
                "more dachshund" to emptyList(),
                "mini dachshund" to emptyList(),
                "dwarf dachshund" to emptyList(),
                "longhaired dachshund" to emptyList()
            ))


    suspend fun dachshundImage() = DogImage("https://images.dog.ceo//breeds//dachshund//dachshund-7.jpg")
}