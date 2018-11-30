package com.microservices.movies

interface MovieService {

    fun getMovies() : List<Movie>
}