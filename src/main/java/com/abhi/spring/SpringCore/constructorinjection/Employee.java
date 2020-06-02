package com.abhi.spring.SpringCore.constructorinjection;

public class Employee {
	
	private int id;
	Address add;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", add=" + add + "]";
	}
	
	public Employee(int id, Address add) {
		
		this.id = id;
		this.add = add;
	}
	
}
