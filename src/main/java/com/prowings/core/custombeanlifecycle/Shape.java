package com.prowings.core.custombeanlifecycle;

public class Shape {
	
	private int length;
	private int width;
	
	public Shape() {
		System.out.println("no-arg constructor invoked!!");
	}

	public void myCustomInit()
	{
		System.out.println("Init method after properties are set : " + length+width);
	}

	public void myCustomDestroy()
	{
		System.out.println("Destroy method invoked: " + length+width);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		System.out.println("setter method for length invoked!!");
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		System.out.println("setter method for width invoked!!");
		this.width = width;
	}
	@Override
	public String toString() {
		return "Shape [length=" + length + ", width=" + width + "]";
	}
}
