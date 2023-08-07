package com.daffamuhtar.luna.di

import com.daffamuhtar.luna.data.remote.MovieService
import com.daffamuhtar.luna.data.remote.RemoteDataSource
import com.daffamuhtar.luna.data.repository.MovieRepositoryImpl
import com.daffamuhtar.luna.domain.repository.MovieRepository
import com.daffamuhtar.luna.domain.usecase.GetMovieUseCase
import com.daffamuhtar.luna.domain.usecase.GetMoviesUseCase
import com.daffamuhtar.luna.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules












