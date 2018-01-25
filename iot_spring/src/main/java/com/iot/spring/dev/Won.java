package com.iot.spring.dev;

public class Won implements Money{

	private int money;

	public String toString() {
		return "총액:"+this.money;
	}

	@Override
	public void setMoney(int money) {
		this.money = money;
		
	}

	@Override
	public void getMoney() {
		// TODO Auto-generated method stub
		
	}



}
