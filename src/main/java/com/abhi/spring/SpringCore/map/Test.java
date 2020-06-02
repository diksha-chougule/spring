package com.abhi.spring.SpringCore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/SpringCore/map/mapConfig.xml");
		Customer bean = (Customer) ctx.getBean("cust");
		System.out.println(bean);
		System.out.println(bean.getProducts().getClass());
		
		

	}

}
