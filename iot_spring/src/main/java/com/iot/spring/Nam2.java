package com.iot.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iot.spring.anno5.Order;
import com.iot.spring.eat2.Laman;

public class Nam2 {
	
	public static void main(String[] args) {
		
	
	ApplicationContext ac=new ClassPathXmlApplicationContext("make2.xml");
	Laman l=(Laman)ac.getBean("laman");
	l.printMake();
	l.printMList();
	}
}
