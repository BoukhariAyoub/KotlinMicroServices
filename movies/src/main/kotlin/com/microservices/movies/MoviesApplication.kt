package com.microservices.movies

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan("com.microservices")
@SpringBootApplication
open class MoviesApplication

fun main(args: Array<String>) {
    runApplication<MoviesApplication>(*args)
}