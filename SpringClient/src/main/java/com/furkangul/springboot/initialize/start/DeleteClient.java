package com.furkangul.springboot.initialize.start;

import org.springframework.web.client.RestTemplate;

public class DeleteClient {
    public static void main(String[] args) {
        long id=304;
        String uri="http://localhost:8080/product/"+id;  //path'in parçası olarak alıyoruz Start projesi>nesnealimi>WritingController sınıfında deleteProduct metodunda.
        RestTemplate restTemplate = new RestTemplate();

        restTemplate.delete(uri);
    }
}
