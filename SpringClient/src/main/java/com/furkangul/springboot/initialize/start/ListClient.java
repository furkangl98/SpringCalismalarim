package com.furkangul.springboot.initialize.start;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ListClient {
    public static void main(String[] args) {
        String uri="http://localhost:8080/products";
        RestTemplate restTemplate = new RestTemplate();

        //List<Product> products=restTemplate.getForObject(uri, List<Product>.class);
                                                                //Böyle "Sana product Listesi gelecek diyemiyoruz. o yüzden aşağıdaki gibi yapıyoruz
        ResponseEntity<List<Product>> entity=restTemplate.exchange(uri, HttpMethod.GET, HttpEntity.EMPTY, new ParameterizedTypeReference<List<Product>>(){});

        List<Product> products=entity.getBody();
        for(Product product:products){
            System.out.println("Product: "+product.getId()+" "+product.getName()+" "+product.getPrice());

        }


    }
}
