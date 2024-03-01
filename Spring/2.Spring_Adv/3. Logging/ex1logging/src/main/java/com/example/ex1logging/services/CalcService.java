package com.example.ex1logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
public class CalcService {

    private final Logger logger = LoggerFactory.getLogger(CalcService.class.getName());


    @Autowired
    private Environment environment;

    public String calcExp() {
        double a = Double.parseDouble((Objects.requireNonNull(environment.getProperty("pippo"))));
        double b = Double.parseDouble((Objects.requireNonNull(environment.getProperty("pluto"))));
        logger.debug("Starting calculation");
        logger.debug("These are your values: " + a + " and " + b);
        logger.debug("Ending calculation. Your result is: " + Math.pow(a, b));
        return "These are your values: " + a + " " + b+". The result is: "+Math.pow(a, b);
    }

    public String throwError() {
        String a = "This is a new error";
        logger.debug("This is the new error");
        return a;
    }
}