package com.example.malektroudiexblanc.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@org.aspectj.lang.annotation.Aspect
@Slf4j
public class Aspect {
    @Around("execution(* com.example.malektroudiexblanc.controller.*.*(..))")
    public void avant(JoinPoint JoinPoint) {
        log.info("In the method "+ JoinPoint.getSignature().getName());
    }
}
