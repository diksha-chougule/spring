package com.abhi.spring.SpringCore.DependancyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/SpringCore/DependancyCheck/Config.xml");
		Prescription bean = (Prescription) ctx.getBean("pobj");
		System.out.println(bean);

	}

}
