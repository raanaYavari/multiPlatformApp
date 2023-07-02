package com.raana.multipro

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform