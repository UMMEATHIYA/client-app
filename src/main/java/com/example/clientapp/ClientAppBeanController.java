package com.example.clientapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientAppBeanController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public ClientAppBean helloWorldBean() {
        // throw new RuntimeException("Some Error has Happened! Contact Support at
        // ***-***");
        return new ClientAppBean("Hello World");
    }

    /// hello-world/path-variable/in28minutes
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public ClientAppBean helloWorldPathVariable(@PathVariable String name) {
        return new ClientAppBean(String.format("Hello World, %s", name));
    }
}
