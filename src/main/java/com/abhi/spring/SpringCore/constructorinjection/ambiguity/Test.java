package com.abhi.spring.SpringCore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/SpringCore/constructorinjection/ambiguity/Config.xml");
		Addition bean = (Addition) ctx.getBean("addtionobj");
		System.out.println(bean);

	}

}
