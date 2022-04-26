package org.example.MoviesApi.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import org.example.MoviesApi.core.Resource
import org.example.MoviesApi.repository.MovieRepository

class MovieViewModel(private  val repo: MovieRepository): ViewModel() {

    fun fetchTopRatedMovies() = liveData(Dispatchers.IO){
        emit(Resource.Loading())

        try {
            emit(Resource.Success(repo.getTopRatedMovies()))
        }catch (e: Exception){
            emit(Resource.Failure(e))
        }
    }

    fun fetchPopularMovies() = liveData(Dispatchers.IO){
        emit(Resource.Loading())

        try {
            emit(Resource.Success(repo.getPopularMovies()))
        }catch (e: Exception){
            emit(Resource.Failure(e))
        }
    }
}

class MovieViewModelFactory(private val repo:MovieRepository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(MovieRepository::class.java).newInstance(repo)
    }
}