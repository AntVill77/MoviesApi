package org.example.MoviesApi.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import org.example.MoviesApi.core.Resource
import org.example.MoviesApi.repository.MovieRepository

class MovieViewModel(private  val repo: MovieRepository): ViewModel() {

    fun fetchMainScreenMovies() = liveData(Dispatchers.IO) {
        emit(Resource.Loading())

        try {
            emit(Resource.Success(Triple(repo.getTopRatedMovies(), repo.getPopularMovies(), repo.getUpcomingMovies())))
            Log.d("LiveData", "fetchMainScreenMoviesR: ${repo.getTopRatedMovies()}")
            Log.d("LiveData", "fetchMainScreenMoviesP: ${repo.getPopularMovies()}")
            Log.d("LiveData", "fetchMainScreenMoviesU: ${repo.getUpcomingMovies()}")
        } catch (e: Exception) {
            emit(Resource.Failure(e))
            Log.d("LiveData", "fetchMainScreenMovies: ${e.message}")
        }
    }
}

class MovieViewModelFactory(private val repo:MovieRepository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(MovieRepository::class.java).newInstance(repo)
    }
}