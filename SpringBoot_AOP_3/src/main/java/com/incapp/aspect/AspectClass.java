package com.incapp.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {
	
	
	//when We wanted get value before the Method Run !!
	@Before("execution (public int sum(int,int))")
	public void abc(JoinPoint p) {
		
		Object o[] = p.getArgs();
		
		for(Object a :o) {
			System.out.println(a);
		}
		System.out.println("Get Parameter Before Method Run |||");
		
	}
	
	
	
	
	//Advice AfterReturning 
	@AfterReturning (pointcut = "execution (public int sum(int , int ))" , returning = "value")
	
	public void abc(int value) {
		System.out.println("Value Returning by Function " +value);
	}
	
	
	
	//Advice Throwing Return
	@AfterThrowing (pointcut = "execution (public int div(int , int))" , throwing = "ex")
	
	public void mno(Exception ex) {
		
		System.out.println("Division Method Exception Occured ");
		System.out.println(ex);
		
	}
	
	
	
	//advice after
	@After("execution (public int div(int , int))")
	public void abc() {
		System.out.println("After Always Occued ");
	}
	
	
	
	//advice after
		@Before("execution (public int div(int , int))")
		public void abc1() {
			System.out.println("Before Also Always Occued ");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
