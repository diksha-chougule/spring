package com.abhi.spring.SpringCore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("inside hi setter method");
		this.id = id;
	}
	
	public void hi()  {
		System.out.println("inside hi method");
	}
	public void bye()  {
		System.out.println("inside bye method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside init method");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("inside destroy method");
		
	}
	
}
