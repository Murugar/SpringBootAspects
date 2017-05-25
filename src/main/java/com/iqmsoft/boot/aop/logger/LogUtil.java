package com.iqmsoft.boot.aop.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.aspectj.lang.annotation.AfterReturning;

import org.aspectj.lang.annotation.AfterThrowing;

import org.aspectj.lang.annotation.Around;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;



@Aspect
@Component
public class LogUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogUtil.class);

    @Before("execution(* com.iqmsoft.boot.aop.rest.SpringBootAspectJController.*(..))")
    public void genericLogging(JoinPoint jp) {
        String args = Arrays.toString(jp.getArgs());
        LOGGER.info("Method Before => {} | Params {}", jp.getSignature().getName(), args);
    }
    
    @After("execution(* com.iqmsoft.boot.aop.rest.SpringBootAspectJController.*(..))")
    public void genericLogging1(JoinPoint jp) {
        String args = Arrays.toString(jp.getArgs());
        LOGGER.info("Method After => {} | Params {}", jp.getSignature().getName(), args);
    }
    
    @AfterReturning("execution(* com.iqmsoft.boot.aop.rest.SpringBootAspectJController.*(..))")
    public void genericLogging2(JoinPoint jp) {
        String args = Arrays.toString(jp.getArgs());
        LOGGER.info("Method Around => {} | Params {}", jp.getSignature().getName(), args);
    }
    
    @AfterThrowing("execution(* com.iqmsoft.boot.aop.rest.SpringBootAspectJController.*(..))")
    public void genericLogging3(JoinPoint jp) {
        String args = Arrays.toString(jp.getArgs());
        LOGGER.info("Method Around => {} | Params {}", jp.getSignature().getName(), args);
    }
    
    @Around("execution(* com.iqmsoft.boot.aop.rest.SpringBootAspectJController.*(..))")
    public void genericLogging4(JoinPoint jp) {
        String args = Arrays.toString(jp.getArgs());
        LOGGER.info("Method Around => {} | Params {}", jp.getSignature().getName(), args);
    }
    
    
}
