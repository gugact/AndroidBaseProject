package com.gugact.androidbaseproject.data.remote

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DogRemoteDataSource @Inject constructor(
    private val dogService: DogService
) {
    suspend fun breedList() = dogService.getBreedList()
    suspend fun dachshundImage() = dogService.getRandomDachshundImage()
}