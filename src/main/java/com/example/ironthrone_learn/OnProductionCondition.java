package com.example.ironthrone_learn;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.util.Scanner;

public class OnProductionCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        System.out.println("Condition");
        return true;
//               return JOptionPane.showConfirmDialog( null, "это продакшен?") == 0;
    }
}