package org.example.MoviesApi.data.remote

import org.example.MoviesApi.data.model.MovieList

class MovieDataSource {

    fun getTopRatedMovies(): MovieList{
        return MovieList()
    }

    fun getPopularMovies(): MovieList{
        return MovieList()
    }
}