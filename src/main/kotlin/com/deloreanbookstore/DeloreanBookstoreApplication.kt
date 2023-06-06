package com.deloreanbookstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DeloreanBookstoreApplication {
    @GetMapping("/")
    fun appOnline(@RequestParam(value = "name") name: String?): String {
        val responseMessage = "Hey, ${name ?: "Jane Doe"}, the Delorean Bookstore app is working, enjoy the ride."
        return responseMessage
    }
}

fun main(args: Array<String>) {
	runApplication<DeloreanBookstoreApplication>(*args)
}