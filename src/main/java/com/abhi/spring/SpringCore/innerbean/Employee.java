package com.abhi.spring.SpringCore.innerbean;

public class Employee {
	
	private int id;
	Address add;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", add=" + add + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

}
