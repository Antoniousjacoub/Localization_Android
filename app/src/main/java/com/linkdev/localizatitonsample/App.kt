package com.linkdev.localizatitonsample

import android.app.Application
import com.linkdev.localization.Localization

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Localization.initialize(this)

    }


}



