package com.daffamuhtar.luna.data.repository

import com.daffamuhtar.luna.data.remote.RemoteDataSource
import com.daffamuhtar.luna.data.util.toMovie
import com.daffamuhtar.luna.domain.model.Movie
import com.daffamuhtar.luna.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
): MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}