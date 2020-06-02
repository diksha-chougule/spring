package com.abhi.spring.SpringCore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhi/spring/SpringCore/list/listConfig.xml");
		Hospitals bean = (Hospitals) ctx.getBean("hospital");
		System.out.println(bean);
		System.out.println(bean.getDept().getClass());

	}

}
