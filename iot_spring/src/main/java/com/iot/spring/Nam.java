package com.iot.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iot.spring.eat.Make;
import com.iot.spring.eat.Samyang;
import com.iot.spring.work.Disinger;

public class Nam {
	private Make make;
	
	
	public Nam(Make make) {
		this.make = make;
	}
	
	/*
	public void Nam(Make make){
		this.make=make;
	}*/
	
	public Make getNam() {
		return make;
	}

	public void setNam(Make make) {
		this.make = make;
	}




	public static void main(String[] args) {
		
	
	ApplicationContext ac= new ClassPathXmlApplicationContext("make.xml");
	
	Nam n = (Nam)ac.getBean("make");
	Samyang samyang = (Samyang)n.getNam();
	samyang.eat();
	}
}
