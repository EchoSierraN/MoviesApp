package com.example.moviesapp.movieList.mappers

import com.example.moviesapp.movieList.data.local.MovieEntity
import com.example.moviesapp.movieList.data.remote.MovieDTO

fun MovieDTO.toMovieEntity(
    category: String
): MovieEntity {
    return MovieEntity(
        id = id ?: -1,
        adult = adult ?: false,
        backdrop_path = backdrop_path ?: "",
        original_language = original_language ?: "",
        original_title = original_title ?: "",
        overview = overview ?: "",
        popularity = popularity ?: 0.0,
        poster_path = poster_path ?: "",
        release_date = release_date ?: "",
        title = title ?: "",
        video = video?: false,
        vote_average = vote_average ?: 0.0,
        vote_count = vote_count ?: 0,
        category = category,
        genre_ids = try {
            genre_ids?.joinToString(",") ?: "-1,-2"
        } catch (e: Exception) {
            "-1,-2"
        }
    )
}