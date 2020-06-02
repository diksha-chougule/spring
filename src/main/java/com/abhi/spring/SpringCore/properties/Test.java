package com.abhi.spring.SpringCore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/SpringCore/properties/propConfig.xml");
		ContryAndLang bean = (ContryAndLang) ctx.getBean("countryAndLang");
		System.out.println(bean);
		System.out.println(bean.getCountryandlangs().getClass());
		
		

	}

}
