package com.kodilla.spring.reader;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotated;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;

public class IfDayIsOddCondition implements Condition {

    @Override
    public  boolean matches( ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        return LocalDate.now().getDayOfMonth() % 2 != 0;
    }
}
