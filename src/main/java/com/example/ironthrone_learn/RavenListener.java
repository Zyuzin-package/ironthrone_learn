package com.example.ironthrone_learn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {
    private final RavenProperties ravenProperties;

    public RavenListener(RavenProperties ravenProperties) {
        this.ravenProperties = ravenProperties;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        ravenProperties.getAddress().forEach(s -> {
            System.out.println("Sending Raven into " + s);
        });
    }

}
