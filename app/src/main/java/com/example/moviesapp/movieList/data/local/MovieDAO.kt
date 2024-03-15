package com.example.moviesapp.movieList.data.local

import androidx.room.Dao
import androidx.room.Upsert
import retrofit2.http.Query

@Dao
interface MovieDAO {
    @Upsert
    suspend fun upsertMovieList(movieList: List<MovieEntity>)

    @Query("SELECT * FROM MovieEntity WHERE id = :id")
    suspend fun getMovieById(id: Int): MovieEntity

    @Query("SELECT * FROM MovieEntity WHERE category = :category")
    suspend fun getMovieByCategory(category: String): List<MovieEntity>
}