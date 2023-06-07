package com.example.ironthrone_learn;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:iron.properties")
@EnableConfigurationProperties(RavenProperties.class)//чтоб RavenProperties в контексте появился
@ConfigurationPropertiesScan // чтоб в RavenProperties работала @ConfigurationProperties
public class IronConfiguration {

    @Bean
    @ConditionalOnProduction
    @ConditionalOnRaven
    public IronListener ironListener() {
        return new IronListener();
    }

    @Bean
    @ConditionalOnProduction
    @ConditionalOnRaven
    public RavenListener ravenListener(RavenProperties ravenProperties) {
        return new RavenListener(ravenProperties);
    }
}
