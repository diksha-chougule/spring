package com.abhi.spring.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext ("Config.xml");
		Employee bean = (Employee) ctx.getBean("emp");
		
		System.out.println(bean);
		

	}

}
