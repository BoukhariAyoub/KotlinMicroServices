package com.microservices.movies

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MoviesController {


    @Autowired
    lateinit var movieService: MovieService

    @GetMapping("/movies")
    fun getMovies() = movieService.getMovies()

}