// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        // Google Services plugin for Firebase
        classpath("com.google.gms:google-services:4.4.1")
    }
}

plugins {
    id("com.android.application") version "9.2.1" apply false
    id("org.jetbrains.kotlin.android") version "2.2.10" apply false
    id("com.google.gms.google-services") version "4.4.1" apply false
}