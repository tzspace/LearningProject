package com.tz.learning.april.Package;

import java.util.logging.*;

public class LoggerTesting {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerTesting.class.getName());
        logger.setLevel(Level.CONFIG);
        for(Handler handler : logger.getParent().getHandlers()){
            handler.setLevel(Level.CONFIG);
        }
        logger.log(Level.FINE, "信息");
        logger.log(Level.CONFIG, "信息");
        logger.log(Level.WARNING, "警告");
        logger.log(Level.INFO, "信息");
        //logger.log(Level.CONFIG, "信息");
        //logger.log(Level.FINE, "信息");
    }
}
