package com.gugact.androidbaseproject.di

import com.gugact.androidbaseproject.data.remote.DogService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object RetrofitModule {

    @Provides
    fun provideOkHttpClient() = OkHttpClient.Builder().addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }).build()

    private val json by lazy {
        Json {
            ignoreUnknownKeys = true
            coerceInputValues = true
            encodeDefaults = true
        }
    }

    @Provides
    @Singleton
    fun provideConverterFactory() = json.asConverterFactory("application/json".toMediaType())

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient, converterFactor: Converter.Factory) =
        Retrofit.Builder().baseUrl("https://dog.ceo/api/")
            .addConverterFactory(converterFactor)
            .client(client).build()

    @Provides
    fun provideDogService(retrofit: Retrofit) = retrofit.create(DogService::class.java)


}