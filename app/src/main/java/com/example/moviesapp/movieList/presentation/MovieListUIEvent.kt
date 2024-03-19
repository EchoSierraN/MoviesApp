package com.example.moviesapp.movieList.presentation

sealed interface MovieListUIEvent {
    data class Paginate(val category: String): MovieListUIEvent
    object Navigate: MovieListUIEvent
}
