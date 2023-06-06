package com.example.ironthrone_learn.LittleDistraction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * I digressed to study and understanding annotation Conditional and his child
 * Here I Learn Annotation ConditionalOnProperties and ConditionalOnBean
 * Work logic: if in application.yaml there is 2 param - rope and soap if they = true, Soap and Rope Beans created, else -> no
 * If beans created - create Gallows bean
 */
@SpringBootApplication
public class ExecutionRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExecutionRunner.class);
    }
}
