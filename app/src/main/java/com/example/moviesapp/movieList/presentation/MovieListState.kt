package com.example.moviesapp.movieList.presentation

import com.example.moviesapp.movieList.domain.model.Movie

data class MovieListState(
    val isLoading: Boolean = true,

    val popularMovieListPage: Int = 1,
    val upcomingMovieListPage: Int = 1,

    //says whether or not the current screen is the popular screen
    val isCurrentPopularScreen: Boolean = true,

    val popularMovieList: List<Movie> = emptyList(),
    val upcomingMovieList: List<Movie> = emptyList()
)