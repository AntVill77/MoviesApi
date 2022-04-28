package org.example.MoviesApi.data.remote

import org.example.MoviesApi.application.AppConstants
import org.example.MoviesApi.data.model.MovieList
import org.example.MoviesApi.repository.WebService

class MovieDataSource(private val webService: WebService ) {

    suspend fun getTopRatedMovies(): MovieList {
       return webService.getTopRatedMovies(AppConstants.API_KEY)

    }

    suspend fun getPopularMovies(): MovieList{
        return webService.getPopularMovies(AppConstants.API_KEY)

    }
}