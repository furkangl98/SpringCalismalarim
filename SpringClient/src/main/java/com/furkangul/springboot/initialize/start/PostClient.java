package com.furkangul.springboot.initialize.start;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PostClient {

    public static void main(String[] args) {
        String uri="http://localhost:8080/product";
        RestTemplate restTemplate = new RestTemplate();

//        Product product = new Product(302,"Desktop Computer",42565);
                                               //en son parametre dönenin türü ama bizim "nesnealimi>postclient"te metodumuz void
        //restTemplate.postForObject(uri,product,Void.class);
                                               //Bu sefer Void döndürmüyoruz id'yi long olarak aldığımız için Long döndürüyoruz.
        Product product = new Product(0,"Desktop Computer",42565);//Id'yi sıfır girdik o bize geri dönecek nasıl kaydedildiyse

//        Long id = restTemplate.postForObject(uri,product,Long.class); aşağıdaki yöntem ise postForObject() metodunu kullanmadan exchange metodu ile yapılmış hali
//        System.out.println("ID: " + id);

        ResponseEntity<Long> entity = restTemplate.exchange(
                uri , HttpMethod.POST , new HttpEntity<>(product) , Long.class);
                                                                    //Burada long geldiği için ResponseEntity'de de long olarak alıyoruz

        long id= entity.getBody();
        System.out.println("ID: " + id);

    }

}
