package com.example.ironthrone_learn.LittleDistraction;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigExecution {

    @Bean
    @ConditionalOnBean({Soap.class, Rope.class})
    public Gallows gallows (){
        return new Gallows();
    }

}
