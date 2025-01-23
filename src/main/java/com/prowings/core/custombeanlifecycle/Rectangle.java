package com.prowings.core.custombeanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rectangle implements InitializingBean, DisposableBean{
	
	private int length;
	private int width;

	public Rectangle() {
		System.out.println("no-arg constructor of Rectangle invoked!!");
	}

	public void myCustomInit()
	{
		System.out.println(">>>>Rectangle>>>>> Init method after properties are set : " + length+width);
	}

	public void myCustomDestroy()
	{
		System.out.println(">>>>Rectangle>>>>> Destroy method invoked: " + length+width);
	}
	
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		System.out.println("setter method for length invoked for Rectangle!!");
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		System.out.println("setter method for width invoked for Rectangle!!");
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println(">>>>>> inside afterPrpSet() of Rectangle Bean!!");
		
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println(">>>>>> inside destroy() of Rectangle Bean!!");
	}
}
