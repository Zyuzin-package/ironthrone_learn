package com.example.ironthrone_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class IronThroneLearnApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(IronThroneLearnApplication.class);
        builder.headless(false);

        SpringApplication springApplication = builder.application();
        springApplication.run();
    }

}
