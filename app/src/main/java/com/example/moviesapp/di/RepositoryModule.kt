package com.example.moviesapp.di

import com.example.moviesapp.movieList.data.repository.MovieListRepositoryImpl
import com.example.moviesapp.movieList.domain.repository.MovieListRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindMovieListRepository(
        movieListRepositoryImpl: MovieListRepositoryImpl
    ): MovieListRepository
}