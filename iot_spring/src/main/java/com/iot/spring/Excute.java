package com.iot.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iot.spring.dev1.Won;
import com.iot.spring.work.Developer;
import com.iot.spring.work.Disinger;
import com.iot.spring.work.Worker;

public class Excute {
	private Worker w;
	
	public Excute(Worker w){
		this.w=w;
	}
	public Worker getWorker() {
		return w;
	}

	public void setWorker(Worker w) {
		this.w = w;
	}




	public static void main(String[] args) {
//		String str="안녕하세요";
//		HelloSpring hs = new HelloSpring();
//		hs.setMessage(str);	
////		System.out.println(hs.getMessage());
		
//		Resource res=new ClassPathResource("beans.xml");
//		XmlBeanFactory bf=new XmlBeanFactory(res);
//		Car c=(Car)bf.getBean("c");

		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean.xml파싱");
//		Car c=(Car)ac.getBean("c");
//				c.printCarInfo();
/*		Won w=(Won)ac.getBean("id");
		System.out.println(w);
		Worker d=(Worker)ac.getBean("developer");
		d.goToWork();
		d.work();*/
		
		Excute ex = (Excute)ac.getBean("ex");
		Disinger designer = (Disinger)ex.getWorker();
		designer.goToWork();
		
//		Car c= new Kia("소나타");
//		Money m=new Won();
//		
//		c.setMoney(m);
//		m.setMoney(30000);
//		c.printCarInfo();
		
//		Test t=(Test)bf.getBean("test");
//		t.printtest();
//		Worker w= new Corder();
//		PrintToDo pd=new PrintToDo();
//		pd.printWork(w);
//		pd.printWork(new Developer());
	}
	

}
