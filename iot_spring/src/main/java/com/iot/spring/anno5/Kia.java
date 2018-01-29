package com.iot.spring.anno5;



import org.springframework.core.annotation.Order;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("kkk")//bean의 이름
//@Scope("prototype")
public class Kia implements Maker{
	public void printName() {
		System.out.println("기아자동차");
	}

}
