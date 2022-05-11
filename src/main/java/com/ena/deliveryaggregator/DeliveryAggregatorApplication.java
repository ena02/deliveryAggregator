package com.ena.deliveryaggregator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DeliveryAggregatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliveryAggregatorApplication.class, args);
    }


}
