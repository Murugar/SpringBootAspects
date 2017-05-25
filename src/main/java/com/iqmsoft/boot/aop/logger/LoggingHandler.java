package com.iqmsoft.boot.aop.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingHandler {

	 private static final Logger LOGGER = LoggerFactory.getLogger(LoggingHandler.class);
	
     @Before("@annotation(com.iqmsoft.boot.aop.logger.Loggable)")
     public void beforeLogging(JoinPoint joinPoint){
         LOGGER.info("Before running loggingAdvice on method=");

    }

    @After("@annotation(com.iqmsoft.boot.aop.logger.Loggable)")
    public void afterLogging(JoinPoint joinPoint){
    	LOGGER.info("After running loggingAdvice on method=");
    }
}


