package com.blog.aejeong.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/api/test")
    fun getTestApi(): String {
        return "This is test word"
    }
}