package org.example.MoviesApi.repository

import org.example.MoviesApi.data.model.MovieList

interface MovieRepository {
    suspend fun getTopRatedMovies(): MovieList
    suspend fun getPopularMovies(): MovieList
}