package org.example.MoviesApi.ui.moviedetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import org.example.MoviesApi.R
import org.example.MoviesApi.databinding.FragmentMovieDetailBinding

class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    private lateinit var binding: FragmentMovieDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieDetailBinding.bind(view)

    }

}