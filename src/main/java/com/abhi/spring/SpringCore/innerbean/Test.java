package com.abhi.spring.SpringCore.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/SpringCore/innerbean/Config.xml");
		Employee bean = (Employee) ctx.getBean("empobj");
		System.out.println(bean);
		

	}

}
