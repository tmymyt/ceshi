package com.tan;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@EnableAspectJAutoProxy
@Aspect
public class AnotationPointCut {

    @Before("execution(* com.tan.Rent.*(..))")
    public void before() {
        System.out.println("租房之前====");
    }

    @After("execution(* com.tan.Rent.*(..))")
    public void after() {
        System.out.println("租房之后====");
    }

}
