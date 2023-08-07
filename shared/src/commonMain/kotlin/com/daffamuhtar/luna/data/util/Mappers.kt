package com.daffamuhtar.luna.data.util

import com.daffamuhtar.luna.data.remote.MovieRemote
import com.daffamuhtar.luna.domain.model.Movie

internal fun MovieRemote.toMovie(): Movie{
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"