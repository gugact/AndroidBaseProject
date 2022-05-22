package com.gugact.androidbaseproject.data.remote

import androidx.lifecycle.LiveData
import com.gugact.androidbaseproject.data.model.DogBreeds
import com.gugact.androidbaseproject.data.model.DogImage
import retrofit2.Response
import retrofit2.http.GET

interface DogService {

    @GET("breeds/list/all")
    suspend fun getBreedList(): DogBreeds

    @GET("breed/dachshund/images/random")
    suspend fun getRandomDachshundImage(): DogImage
}