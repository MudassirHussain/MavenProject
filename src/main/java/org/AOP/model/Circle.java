package org.AOP.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("circle setter ");
		this.name = name;
	}
	
	public String setNameandReturn(String name) {
		System.out.println("circle setter ");
		this.name = name;
		return name;
	}
	
	
}
