package com.daffamuhtar.luna.android.di

import com.daffamuhtar.luna.android.detail.DetailViewModel
import com.daffamuhtar.luna.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}