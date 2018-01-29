package com.iot.spring.anno5;

import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Named//컨포넌트와 같다
public class Order {
	
	@Autowired//찾아서 자동으로 맵핑시켜주는것
	@Qualifier("kkk")//여러게일때 아까 입력한 bean의 이름 으로 맵핑
	private Maker m;
	
	@Autowired//한개일떄는 자동으로 맵핑된다
	private List<Maker> mList;
	
	public void printMaker() {
		m.printName();
	}
	
	public void printMList() {
		for(Maker m:mList) {
			m.printName();
		}
	}

}
