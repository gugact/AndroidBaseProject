package com.gugact.androidbaseproject

import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Application : android.app.Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(this.javaClass.canonicalName, "OnCreate")
        //setup app
    }
}