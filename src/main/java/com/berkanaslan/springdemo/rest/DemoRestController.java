package com.berkanaslan.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Berkan Aslan
 * 3.04.2021
 */

@RestController
@RequestMapping("/test")
public class DemoRestController {

    // Add code for the /hello endpoint:
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello world!";
    }
}
