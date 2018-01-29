package com.iot.spring.eat;

public class Samyang implements Make{

	@Override
	public void make() {
		System.out.println("삼양라면 만들어요");
		
	}

	@Override
	public void eat() {
		System.out.println("삼양라면 먹어요");
		
	}

}
