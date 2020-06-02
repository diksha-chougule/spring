package com.abhi.spring.SpringCore.constructorinjection.ambiguity;

public class Addition {

	Addition(int a, double b) {
		System.out.println("inside constructor ");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
	}

}
