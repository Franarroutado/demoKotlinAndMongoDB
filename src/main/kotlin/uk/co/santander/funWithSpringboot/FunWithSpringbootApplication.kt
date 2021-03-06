package uk.co.santander.funWithSpringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FunWithSpringbootApplication

fun main(args: Array<String>) {
	runApplication<FunWithSpringbootApplication>(*args)
}
