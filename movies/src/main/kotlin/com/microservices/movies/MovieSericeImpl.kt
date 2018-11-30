package com.microservices.movies

import com.microservices.actors.ActorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl : MovieService {

    @Autowired
    lateinit var actorService: ActorService

    companion object {
        val moviesNames = mapOf(1 to "Venom", 2 to "SpiderMan", 3 to "Le Jeu", 4 to "Shawshank Redemption")
    }


    override fun getMovies(): List<Movie> {
        return moviesNames.map { (id, name) ->
            val movieStars = actorService.getActorsInMovies(id)
            Movie(id, name, movieStars)
        }
    }
}