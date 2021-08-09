package io.tjohander.alpha.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/posts/v1")
class PostsController {

    @GetMapping("/posts")
    @ResponseStatus(HttpStatus.OK)
    fun getPosts() = "posts!"
}