package test.coding.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration
import org.springframework.boot.runApplication

/*
 * disable R2DBC in application by excluding the autoconfiguration
 */
@SpringBootApplication(exclude = [R2dbcAutoConfiguration::class])
class Application

fun main(vararg args: String) {
    runApplication<Application>(*args)
}
