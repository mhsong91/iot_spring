package com.iot.spring.dev1;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component("id")//id를설정할수도 있다.
public class Won {
	private int money;
	
	public Won() {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i+"X"+j+"="+(i*j)+",");		
			}
			System.out.println("");
		}
			}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

}
