package com.incapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.incapp.bean.Addition;

@SpringBootApplication
public class SpringBootAop3Application {

	public static void main(String[] args) {
	   ApplicationContext context =	SpringApplication.run(SpringBootAop3Application.class, args);
	   
	   
	   Addition a = context.getBean(Addition.class);
	   
	   a.sum(34, 40);
	   
	   
	   a.div(234, 0);
	   
	}

}
