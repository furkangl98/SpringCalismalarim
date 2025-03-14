package com.furkangul.springboot.initialize.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }
    @RequestMapping(value="/welcome",method = RequestMethod.GET)
    public String welcome(){
        return "Hi";
    }
}
