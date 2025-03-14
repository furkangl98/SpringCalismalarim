package com.furkangul.springboot.initialize.start;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ObjectClient {
    public static void main(String[] args) {
        String uri="http://localhost:8080/product";
        RestTemplate restTemplate = new RestTemplate();

        //Product product=restTemplate.getForObject(uri,Product.class);

        ResponseEntity<Product> entity=restTemplate.exchange(uri, HttpMethod.GET, HttpEntity.EMPTY,Product.class);
        Product product=entity.getBody();

        System.out.println("Product: "+product.getId()+" "+product.getName()+" "+product.getPrice());
    }
}
