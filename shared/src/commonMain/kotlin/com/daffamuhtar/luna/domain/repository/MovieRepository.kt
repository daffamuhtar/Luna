package com.daffamuhtar.luna.domain.repository

import com.daffamuhtar.luna.domain.model.Movie

internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}