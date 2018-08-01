package com.github.punkkk.helloSpring;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }

    @RequestMapping("/somesthing")
    public Something something () {
        return new Something(100L, "seledok");
    }
}