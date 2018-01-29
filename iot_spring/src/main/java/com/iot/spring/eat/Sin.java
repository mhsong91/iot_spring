package com.iot.spring.eat;

public class Sin implements Make{

	@Override
	public void make() {
		System.out.println("신라면 만들어요");
		
	}

	@Override
	public void eat() {
		System.out.println("신라면 먹어요");
		
	}

}
