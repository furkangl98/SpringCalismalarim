package com.furkangul.springboot.initialize.start;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PutClient {
    public static void main(String[] args) {
        String uri="http://localhost:8080/product";
        RestTemplate restTemplate = new RestTemplate();

        Product product = new Product(303,"Laptop Computer",65780);
        restTemplate.exchange(
                uri , HttpMethod.PUT , new HttpEntity<>(product) , Void.class);
                    //PUT ile çağır       product'ı yolla        Karşı taraftan bir şey beklemiyorum

    }
}
