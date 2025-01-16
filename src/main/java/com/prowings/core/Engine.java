package com.prowings.core;

public class Engine {
	
	private String type;
	private float capacity;
	
	public Engine() {
		System.out.println("inside Engine's no-arg constructor!!!");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getCapacity() {
		return capacity;
	}
	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", capacity=" + capacity + "]";
	}

}
