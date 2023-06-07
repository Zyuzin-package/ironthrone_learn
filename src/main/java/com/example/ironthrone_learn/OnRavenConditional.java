package com.example.ironthrone_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.AllNestedConditions;
import org.springframework.boot.autoconfigure.condition.AnyNestedCondition;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

public class OnRavenConditional extends AllNestedConditions {

    public OnRavenConditional() {
        super(ConfigurationPhase.REGISTER_BEAN);
    }

    @ConditionalOnProperty("raven.address")
    public static class OnRavenProperty {
    }

    @ConditionalOnProperty(value = "raven.enabled",
            havingValue = "true",
            matchIfMissing = true)
    public static class OnRavenEnabled {
    }
}
