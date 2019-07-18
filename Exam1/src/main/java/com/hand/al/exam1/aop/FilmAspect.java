package com.hand.al.exam1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FilmAspect {

    @Pointcut("execution(* com.hand.al.exam1.service..*(..))")
    public void p1(){};

    @Around("p1()")
    public Object aroundAction(ProceedingJoinPoint p) throws Throwable {
        BeforeInsertFilmEvent();
        Object[] args = p.getArgs();
        Object ret = p.proceed(args);
        AfterInsertFilmEvent();
        return ret;
    }


    public void BeforeInsertFilmEvent(){
        System.out.println("Before Insert Film Data");
    }

    public void AfterInsertFilmEvent(){
        System.out.println("After Insert Film Data");
    }
}
