package com.abhi.spring.SpringCore.lc.xmlconfig;

public class Patient {

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
	
}
