package org.example.MoviesApi.ui.movie

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import org.example.MoviesApi.R
import org.example.MoviesApi.core.Resource
import org.example.MoviesApi.data.model.MovieList
import org.example.MoviesApi.data.remote.MovieDataSource
import org.example.MoviesApi.databinding.FragmentMovieBinding
import org.example.MoviesApi.presentation.MovieViewModel
import org.example.MoviesApi.presentation.MovieViewModelFactory
import org.example.MoviesApi.repository.MovieRepositoryImpl
import org.example.MoviesApi.repository.RetrofitClient

class MovieFragment : Fragment(R.layout.fragment_movie) {

    private lateinit var binding: FragmentMovieBinding
    private val viewModel by viewModels<MovieViewModel> {
        MovieViewModelFactory(MovieRepositoryImpl(MovieDataSource(RetrofitClient.webservice)
        )) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieBinding.bind(view)

        viewModel.fetchMainScreenMovies().observe(viewLifecycleOwner, Observer { result ->
            when(result){
                is Resource.Loading -> {
                    Log.d("LiveData", "Loading...")
                }
                is Resource.Success -> {
                    Log.d("LiveData", "TopRated: ${result.data.first} \n \n Popular: ${result.data.second}")
                }
                is Resource.Failure -> {
                    Log.d("Error", "${result.exception}")
                }
            }

        })
    }
}