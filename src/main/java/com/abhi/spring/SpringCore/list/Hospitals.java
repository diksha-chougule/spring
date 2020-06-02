package com.abhi.spring.SpringCore.list;

import java.util.List;

public class Hospitals {
	
	private String hospitalname;
	private List<String> dept;
	
	@Override
	public String toString() {
		return "Hospitals [hospitalname=" + hospitalname + ", dept=" + dept + "]";
	}
	
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public List<String> getDept() {
		return dept;
	}
	public void setDept(List<String> dept) {
		this.dept = dept;
	}
	
}
