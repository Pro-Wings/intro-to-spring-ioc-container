package com.prowings.core.circulardependency;

import java.util.Set;

public class B {
	
	private int id;
	private String name;
	
	private Set<Integer> mobileNumbers;
	
	public Set<Integer> getMobileNumbers() {
		return mobileNumbers;
	}
	public void setMobileNumbers(Set<Integer> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("inside setter of B-id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("inside setter of B-name");
		this.name = name;
	}
	@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + ", mobileNumbers=" + mobileNumbers + "]";
	}


	
	
}
