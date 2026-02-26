package org.example.MoviesApi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import org.example.MoviesApi.R
import org.example.MoviesApi.data.remote.MovieDataSource
import org.example.MoviesApi.presentation.MovieViewModel
import org.example.MoviesApi.presentation.MovieViewModelFactory
import org.example.MoviesApi.repository.MovieRepositoryImpl
import org.example.MoviesApi.repository.RetrofitClient
import kotlin.getValue

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<MovieViewModel> {
        MovieViewModelFactory(MovieRepositoryImpl(MovieDataSource(RetrofitClient.webservice)
        )) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}