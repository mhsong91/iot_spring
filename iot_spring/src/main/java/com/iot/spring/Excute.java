package com.iot.spring;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Excute {
	

	
	
	public static void main(String[] args) {
//		String str="안녕하세요";
//		HelloSpring hs = new HelloSpring();
//		hs.setMessage(str);	
//		System.out.println(hs.getMessage());
		Resource res=new ClassPathResource("beans.xml");
		System.out.println("bean.xml파싱");
		XmlBeanFactory bf=new XmlBeanFactory(res);
		Test t=(Test)bf.getBean("test");
		t.printtest();
	
//		Worker w= new Corder();
//		PrintToDo pd=new PrintToDo();
//		pd.printWork(w);
//		pd.printWork(new Developer());
	}
	

}
