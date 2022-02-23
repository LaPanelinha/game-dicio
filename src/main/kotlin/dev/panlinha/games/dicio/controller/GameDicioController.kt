package dev.panlinha.games.dicio.controller

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

@Controller
class GameDicioController {

    @MessageMapping("/dicio")
    @SendTo("/topic/dicio")
    fun helloWorld(): String {
        return "Hello, world"
    }

}
