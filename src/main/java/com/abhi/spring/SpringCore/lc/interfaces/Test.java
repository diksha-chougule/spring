package com.abhi.spring.SpringCore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/SpringCore/lc/interfaces/Config.xml");
		Patient bean = (Patient) ctx.getBean("patientobj");
		System.out.println(bean);
		ctx.registerShutdownHook();

	}

}
