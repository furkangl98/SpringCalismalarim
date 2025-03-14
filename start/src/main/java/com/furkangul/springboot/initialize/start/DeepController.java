package com.furkangul.springboot.initialize.start;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/deep")
public class DeepController {

    @GetMapping("/reply")
    public String getReply(){
        return "Deep Reply";
    }
}
