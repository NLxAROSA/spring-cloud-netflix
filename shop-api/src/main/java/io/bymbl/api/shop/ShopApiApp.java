package io.bymbl.api.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Author: lars
 * Since: 14-12-15.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ShopApiApp {

    public static void main(String[] args) {
        SpringApplication.run(ShopApiApp.class, args);
    }

}
