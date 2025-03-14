package com.furkangul.springboot.initialize.start.nesnegonderimi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("product/count")
    public int getProductCount(){
        return 3;
    }

    @GetMapping("product")
    public Product getProduct(){
        return new Product(301,"Mobile Phone",13450);
    }
    @GetMapping("products")//format olarak başka türden de gönderilebilir ama http JSON olarak alıyor onu belirtmezsen.
                           //localhost'ta incele>network>Headers'a gidip contentType'ın json olduğunu görebilirsin.
    public List<Product> getProducts(){
        List<Product> products=new ArrayList<>();
        products.add(new Product(301,"Mobile Phone",13451));
        products.add(new Product(302,"Desktop Computer",43565));
        products.add(new Product(303,"Laptop Computer",52120));
        return products;
    }

}
