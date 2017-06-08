package com.vldmrProjects.simplemicroservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SimpleMicroserviceApplication

fun main(args: Array<String>) {
    SpringApplication.run(SimpleMicroserviceApplication::class.java, *args)
}
