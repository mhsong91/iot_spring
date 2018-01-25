package com.iot.spring.dev;

public class Kia implements Car{

	private Money m;
	private String name;
	public Kia() {
		
	}
	
	public Kia(String name) {
		this.name=name;
	}
	public Kia(Money m) {
	this.m=m;	
	}
	
	@Override
	public void setMoney(Money m) {
	this.m=m;	
	}

	@Override
	public Car buyCar() {
		
		return new Kia();
	}

	@Override
	public void printCarInfo() {
		System.out.println("입금정보:"+m);
		System.out.println("구매차량:"+name);
	}

}
