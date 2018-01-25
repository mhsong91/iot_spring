package com.iot.spring.work;

public class Developer implements Worker{

	@Override
	public void goToWork() {
	System.out.println("개발자 출근");
		
	}

	@Override
	public void work() {
	System.out.println("개발자 일함");
		
	}

	@Override
	public void getOffWork() {
	System.out.println("개발자 퇴근");
		
	}

}
