/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mezameidiaputri.peminjaman.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ASUS
 */
@SpringBootApplication
public class PeminjamanServiceApplication1 {

public static void main(String[] args) {
    SpringApplication.run(PeminjamanServiceApplication1.class, args);
}

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
