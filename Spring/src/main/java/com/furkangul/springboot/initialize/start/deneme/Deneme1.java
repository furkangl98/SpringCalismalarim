package com.furkangul.springboot.initialize.start.deneme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Deneme1 {

    @GetMapping("/square1/{number}")
    public int square(@PathVariable(name="number") int sourceNumber){

        return sourceNumber*sourceNumber;
    }

}
