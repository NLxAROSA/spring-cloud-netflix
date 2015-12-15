package io.bymbl.service.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Author: lars
 * Since: 14-12-15.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CustomerServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApp.class, args);
    }

}
