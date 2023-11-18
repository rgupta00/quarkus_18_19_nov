package com.bookapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "foo")
public class HelloController {

    @GetMapping(path = "hello/{name}")
    public String hello(@PathVariable String name){
        return "hello to all "+name;
    }
    //foo/hello2?name=raj&city=delhi
    @GetMapping(path = "hello2")
    public String hello2(@RequestParam String name,@RequestParam String city){
        return "hello to all "+name;
    }
}
