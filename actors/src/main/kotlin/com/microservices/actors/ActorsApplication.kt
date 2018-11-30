package com.microservices.actors

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@ComponentScan("com.microservices")
@SpringBootApplication
open class ActorsApplication

fun main(args: Array<String>) {
    runApplication<ActorsApplication>(*args)
}
