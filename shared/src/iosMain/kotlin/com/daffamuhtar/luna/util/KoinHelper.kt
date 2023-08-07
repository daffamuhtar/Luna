package com.daffamuhtar.luna.util

import com.daffamuhtar.luna.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}