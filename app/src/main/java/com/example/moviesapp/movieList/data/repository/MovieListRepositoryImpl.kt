package com.example.moviesapp.movieList.data.repository

import com.example.moviesapp.movieList.domain.model.Movie
import com.example.moviesapp.movieList.domain.repository.MovieListRepository
import com.example.moviesapp.movieList.util.Resource
import kotlinx.coroutines.flow.Flow

class MovieListRepositoryImpl: MovieListRepository {
    override suspend fun getMovieList(
        forceFetchFromRemote: Boolean,
        category: String,
        page: Int
    ): Flow<Resource<List<Movie>>> {

    }

    override suspend fun getMovie(id: Int): Resource<Movie> {

    }
}