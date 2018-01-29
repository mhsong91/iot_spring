package com.iot.spring.eat2;

import org.springframework.stereotype.Component;

@Component("bb")
public class Sin implements Make{



	@Override
	public void eat() {
		System.out.println("신라면 먹어요");
		
	}

}
