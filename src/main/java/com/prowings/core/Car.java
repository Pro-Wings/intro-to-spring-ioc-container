
package com.prowings.core;

public class Car {
	
	private int model;
	private String company;
	private Engine engine;
	
	public Car() {
		System.out.println("inside car's no-arg constructor!!!");
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", company=" + company + ", engine=" + engine + "]";
	}
	
	
}
