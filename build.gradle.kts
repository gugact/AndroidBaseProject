// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    kotlin("android") version "1.6.21" apply false
    kotlin("plugin.serialization") version "1.6.21" apply false
    id("com.android.application") version "7.2.0" apply false
    id("com.android.library") version "7.2.0" apply false
    id("com.google.gms.google-services") version "4.3.10" apply false
    id("com.google.firebase.crashlytics") version "2.8.1" apply false
    id("androidx.navigation.safeargs.kotlin") version "2.4.2" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}

buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.41")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.6.21")
    }
}