package com.iot.spring.eat2;

import java.util.List;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.iot.spring.anno5.Maker;

@Named
public class Laman {

	@Autowired
	@Qualifier("aa")
	private Make m;
	
	@Autowired
	private List<Make> mList;
	
	public void printMake() {
		 m.eat();
	}
	
	public void printMList() {
		for(Make m:mList) {
			m.eat();
		}
	}
}
