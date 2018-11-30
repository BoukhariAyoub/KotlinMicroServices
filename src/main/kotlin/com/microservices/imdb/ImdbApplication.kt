package com.microservices.imdb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.microservices.actors.Actor
import com.microservices.movies.Movie


@SpringBootApplication(scanBasePackageClasses = [
    com.microservices.movies.MoviesApplication::class,
    com.microservices.actors.ActorsApplication::class])
open class ImdbApplication

fun main(args: Array<String>) {
    val movie: Movie? = null
    val actor: Actor? = null
    runApplication<ImdbApplication>(*args)
}
