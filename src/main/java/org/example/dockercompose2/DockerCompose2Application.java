package org.example.dockercompose2;

import org.example.dockercompose2.entity.Product;
import org.example.dockercompose2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DockerCompose2Application {
//    @Autowired
//    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(DockerCompose2Application.class, args);
    }

//    @Overridecl
//    public void run(String... args) throws Exception {
//        Product product = new Product(null, "banana");
//        productRepository.save(product);
//        final List<Product> products = productRepository.findAll();
//        System.out.println(products);
//    }



}
