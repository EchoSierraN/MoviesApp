package com.example.moviesapp.movieList.data.remote

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val IMAGE_BASE_URL = "https://image.themoviedb.org/t/p/w500"
        const val API_KEY = "fd3bf26d5e58aeb9e2abdc8680e4d8c9"
    }

    @GET
    suspend fun getMoviesList(
        @Path("category") category: String,
        @Query("page") page: Int,
        @Query("api_key") api_key: String = API_KEY
    ): MovieListDTO
}