package com.example.ironthrone_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyRavenListener extends RavenListener implements ApplicationListener<ContextRefreshedEvent> {

    RavenProperties ravenProperties;

    public MyRavenListener(RavenProperties ravenProperties) {
        super(ravenProperties);
        this.ravenProperties = ravenProperties;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ravenProperties.getAddress().forEach(s -> {
            System.out.println("event = " + event);
        });
    }
}