package com.example.ironthrone_learn.LittleDistraction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "execution.rope",havingValue ="true")
public class Rope {
    public Rope() {
        System.out.println("Create Rope");
    }
}
