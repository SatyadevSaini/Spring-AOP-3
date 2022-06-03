package com.incapp.bean;

import org.springframework.stereotype.Component;

@Component
public class Addition {
    
	public int sum(int x  , int y ) {  //JoinPoint
		System.out.println("Doing Sum ");
		return x+y;
	}
	
	public int div(int x  , int y ) {//JoinPoint
		System.out.println("Doing Division ");
		return x/y;
	}
	
	
}
