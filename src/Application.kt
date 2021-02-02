package ir.fallahpoor

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty) {
        routing {
            get("/hello") {
                call.respondText("Hello, World!")
            }
        }
    }.start(wait = true)
}

