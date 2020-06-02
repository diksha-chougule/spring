package com.abhi.spring.SpringCore.reftypes;

public class Scores {
	
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", phy=" + phy + ", chem=" + chem + "]";
	}
	private double maths;
	private double phy;
	private double chem;
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getPhy() {
		return phy;
	}
	public void setPhy(double phy) {
		this.phy = phy;
	}
	public double getChem() {
		return chem;
	}
	public void setChem(double chem) {
		this.chem = chem;
	}

}
