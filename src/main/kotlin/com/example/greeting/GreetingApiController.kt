package com.example.greeting

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingApiController {

    @GetMapping("/api/greeting")
    fun greeting(): String {
        return "Hello, World V12!!"
    }
}