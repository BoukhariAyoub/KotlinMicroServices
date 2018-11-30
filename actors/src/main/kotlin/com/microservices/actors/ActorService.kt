package com.microservices.actors

interface ActorService {
    fun getActors() : List<Actor>
    fun getActorsInMovies(movieId: Int): List<Actor>
}