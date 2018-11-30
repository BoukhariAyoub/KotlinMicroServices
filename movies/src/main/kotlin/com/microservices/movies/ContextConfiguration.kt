package com.microservices.movies

import com.microservices.actors.ActorService
import com.microservices.actors.ActorServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class ContextConfiguration {
  @Bean
  open fun actorService() : ActorService = ActorServiceImpl()

  @Bean
  open fun movieService() : MovieService = MovieServiceImpl()

}