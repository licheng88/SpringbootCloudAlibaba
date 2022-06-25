package com.Capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(NacosApplicaiton.class,args);
    }
}
