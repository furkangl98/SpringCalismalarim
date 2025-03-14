package com.furkangul.springboot.initialize.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdaptiveController {
    @GetMapping("/square/{number}")
    public double square(@PathVariable(name="number") double sourceNumber){
        return sourceNumber*sourceNumber;
    }

    //Yukarıdaki metot zorunlu olarak parametre alıyor. Aşağıdakinde ise 2 path tanımladık, ikincisinde gerekli değil
    //iki path tanımlarken {} pathleri küme parantezi içine alıp virgülle ayırıyoruz
    @GetMapping({"/cube/{number}","/cube"})
                                                    //burada required = false diyerek parametre almayabilir diyoruz
    public Double cube(@PathVariable(name="number",required = false) Double sourceNumber){
        if(sourceNumber==null){
            return 0.0;
        }
        return sourceNumber*sourceNumber*sourceNumber;
    }

    @GetMapping("/tesseract") //burada artık parametreyi pathten beklemiyoruz requestparam kullandığımız için (http://localhost:8080/tesseract?number=3)
    public double getTesseract(@RequestParam(name="number") double sourceNumber){
        return sourceNumber*sourceNumber*sourceNumber*sourceNumber;
    }
}
