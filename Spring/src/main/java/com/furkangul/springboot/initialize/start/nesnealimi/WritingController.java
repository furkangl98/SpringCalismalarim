package com.furkangul.springboot.initialize.start.nesnealimi;

import com.furkangul.springboot.initialize.start.nesnegonderimi.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class WritingController {

//    @PostMapping("product")
//
//    public void postProduct(@RequestBody Product product){
//        System.out.println("Post Product: "+product.getId()+" "+product.getName()+" "+product.getPrice());
//
//    }Yukarısı PostClient'te Void.class gönderimine ait

    @PostMapping("product")
    public long postProduct(@RequestBody Product product){
        System.out.println("Post Product: "+product.getId()+" "+product.getName()+" "+product.getPrice());
        product.setId(302);
        return product.getId();
    }

    @PutMapping("product")
    public void putProduct(@RequestBody Product product){
        System.out.println("Post Product: "+product.getId()+" "+product.getName()+" "+product.getPrice());

    }
    @DeleteMapping("product/{id}")
    public void deleteProduct(@PathVariable(name = "id") long productId){
        System.out.println("Delete Product "+productId);
    }

}
