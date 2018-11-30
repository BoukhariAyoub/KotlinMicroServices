package com.microservices.actors

import org.springframework.stereotype.Service

@Service
class ActorServiceImpl : ActorService {

    companion object {
        val actors = listOf(
                Actor(1, "James Hardy", listOf(1, 3)),
                Actor(2, "Samuel L. Jackson", listOf(4, 3)),
                Actor(3, "Hall Berry", listOf(1)),
                Actor(4, "John Travolta", listOf(4))
        )
    }

    override fun getActors(): List<Actor> = actors

    override fun getActorsInMovies(movieId: Int): List<Actor> {
        return actors.filter { actor -> movieId in actor.movies }
    }
}