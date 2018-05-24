package com.bjethwan.maven;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogWrapper 
{
    private final Logger logger;
 
    public LogWrapper() {
        logger = LogManager.getLogger("com.bjethwan.maven");
    }

    void log(String message) {
        logger.info(message);
    }
}
