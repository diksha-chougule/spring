package com.abhi.spring.SpringCore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/SpringCore/set/setConfig.xml");
		CarDealer bean = (CarDealer) ctx.getBean("cd");
		System.out.println(bean);
		System.out.println(bean.getModels().getClass());
	}

}
