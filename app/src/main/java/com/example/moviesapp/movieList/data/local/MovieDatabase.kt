package com.example.moviesapp.movieList.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [MovieEntity::class],
    version = 1
)
abstract class MovieDatabase: RoomDatabase() {
    abstract val movieDAO: MovieDAO
}