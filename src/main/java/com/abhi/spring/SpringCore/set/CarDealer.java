package com.abhi.spring.SpringCore.set;

import java.util.List;
import java.util.Set;

public class CarDealer {

	private String cdname;
	private Set<String> models;
	public String getCdname() {
		return cdname;
	}
	public void setCdname(String cdname) {
		this.cdname = cdname;
	}
	@Override
	public String toString() {
		return "CarDealer [cdname=" + cdname + ", models=" + models + "]";
	}
	public Set<String> getModels() {
		return models;
	}
	public void setModels(Set<String> models) {
		this.models = models;
	}
	
}
