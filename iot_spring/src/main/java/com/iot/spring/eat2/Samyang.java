package com.iot.spring.eat2;

import org.springframework.stereotype.Component;
@Component("aa")
public class Samyang implements Make{


	
	@Override
	public void eat() {
		System.out.println("삼양라면 먹어요");
		
	}

}
