package io.initializ.labs.todo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("hello-world/{firstName}")
    public String getHelloWorld(@PathVariable("firstName") String firstName){
        return "Welcome to Spring boot "+firstName;        
    }
    
    @GetMapping("hello")
    public String getHello(@RequestParam(name="fName") String firstName){
        return "Welcome to Spring boot "+firstName;         
    }
}
