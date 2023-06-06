package com.example.ironthrone_learn;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional({OnRavenConditional.class})
public @interface ConditionalOnRaven {
}
