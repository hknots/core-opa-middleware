package no.fintlabs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CoreOpaMiddlewareApplication

fun main(args: Array<String>) {
    runApplication<CoreOpaMiddlewareApplication>(*args)
}
