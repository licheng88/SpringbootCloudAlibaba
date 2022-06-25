package Capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//随便写写测试一下
@SpringBootApplication
@EnableDiscoveryClient
public class NacosApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(NacosApplicaiton.class,args);
    }
}
