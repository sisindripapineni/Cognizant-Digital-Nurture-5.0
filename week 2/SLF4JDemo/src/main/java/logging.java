package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        int a = 20;
        int b = 10;

        logger.debug("Adding numbers");

        int sum = a + b;

        logger.info("Sum = {}", sum);

        logger.warn("This is a warning message");

        logger.error("This is an error message");

        logger.info("Application Finished");
    }
}