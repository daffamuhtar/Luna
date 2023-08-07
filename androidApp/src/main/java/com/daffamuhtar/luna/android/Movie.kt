package com.daffamuhtar.luna.android

import android.app.Application
import com.daffamuhtar.luna.android.di.appModule
import com.daffamuhtar.luna.di.getSharedModules
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}