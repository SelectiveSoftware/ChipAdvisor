package io.selectivesoftware.chipadvisor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
