package com.yoshi.multimoduletest

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MultiModuleTestApp: Application(){


    override fun onCreate() {
        super.onCreate()

//        coreComponent = DaggerCoreComponent

    }


}