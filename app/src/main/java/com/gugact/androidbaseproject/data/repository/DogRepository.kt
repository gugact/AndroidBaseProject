package com.gugact.androidbaseproject.data.repository

import com.gugact.androidbaseproject.data.local.DogLocalDataSource
import com.gugact.androidbaseproject.data.remote.DogRemoteDataSource
import javax.inject.Inject

class DogRepository @Inject constructor(
    private val remoteDataSource: DogRemoteDataSource,
    private val localDataSource: DogLocalDataSource
) {
    //remote
    suspend fun breeds() = remoteDataSource.breedList()
    suspend fun dachshundImage() = remoteDataSource.dachshundImage()


    //local
//    suspend fun breeds() = localDataSource.breedList()
//    suspend fun dachshundImage() = localDataSource.dachshundImage()

}