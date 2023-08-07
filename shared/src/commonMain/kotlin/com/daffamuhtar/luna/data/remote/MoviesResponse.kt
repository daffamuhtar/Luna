package com.daffamuhtar.luna.data.remote

@kotlinx.serialization.Serializable
internal data class MoviesResponse(
    val results: List<MovieRemote>
)
