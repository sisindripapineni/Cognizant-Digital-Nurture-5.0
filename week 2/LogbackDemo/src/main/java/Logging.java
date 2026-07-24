package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        logger.trace("Trace Message");
        logger.debug("Debug Message");
        logger.info("Info Message");
        logger.warn("Warning Message");
        logger.error("Error Message");

    }
}