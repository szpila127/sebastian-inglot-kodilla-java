package com.kodilla.patterns2.aop.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Watcher {
    private static Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    public void logEvent() {
        LOGGER.info("Logging the event");
    }
}
