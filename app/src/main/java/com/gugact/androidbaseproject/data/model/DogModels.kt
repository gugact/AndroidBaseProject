package com.gugact.androidbaseproject.data.model

import kotlinx.serialization.Serializable

@Serializable
data class DogBreeds(
    val message: Map<String,List<String>>
){
    val breedList = message.keys.toList()
}

@Serializable
data class DogImage(
    val message: String
)