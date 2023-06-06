package com.example.ironthrone_learn.LittleDistraction;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "execution.soap",havingValue ="true")
public class Soap {
    public Soap() {
        System.out.println("Create Soap");
    }
}
