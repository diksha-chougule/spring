package com.abhi.spring.SpringCore.properties;

import java.util.Properties;

public class ContryAndLang {
	
	private Properties countryandlangs;

	public Properties getCountryandlangs() {
		return countryandlangs;
	}

	@Override
	public String toString() {
		return "ContryAndLang [countryandlangs=" + countryandlangs + "]";
	}

	public void setCountryandlangs(Properties countryandlangs) {
		this.countryandlangs = countryandlangs;
	}

}
