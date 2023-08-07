package com.daffamuhtar.luna

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform