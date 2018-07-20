package org.oleggalimov.kotlinspringmvc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinspringmvcApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinspringmvcApplication::class.java, *args)
}
