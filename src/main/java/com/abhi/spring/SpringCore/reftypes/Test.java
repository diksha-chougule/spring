package com.abhi.spring.SpringCore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/SpringCore/reftypes/propConfig.xml");
		Student bean = (Student) ctx.getBean("studentobj");
		System.out.println(bean);

	}

}
