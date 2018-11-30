package com.microservices.movies

import com.microservices.actors.Actor


data class Movie(val id: Int, val title: String, val actors: List<Actor>)