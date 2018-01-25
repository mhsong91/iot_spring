package com.iot.spring.work;

public class Disinger implements Worker{

	@Override
	public void goToWork() {
		System.out.println("디자이너 출근");
		
	}

	@Override
	public void work() {
		System.out.println("디자이너 일함");
		
	}

	@Override
	public void getOffWork() {
		System.out.println("디자이너 퇴근");
		
	}

}
