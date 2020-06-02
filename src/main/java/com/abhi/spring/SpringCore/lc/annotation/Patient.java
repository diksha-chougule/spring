package com.abhi.spring.SpringCore.lc.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient  {

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
	
	@PostConstruct
	public void hi()  {
		System.out.println("inside hi method");
	}
	
	@PreDestroy
	public void bye()  {
		System.out.println("inside bye method");
	}


	
}
