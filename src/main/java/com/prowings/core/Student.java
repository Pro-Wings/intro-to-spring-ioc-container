package com.prowings.core;

public class Student {
	
	private int rollNumber;
	private String name;
	private String address;

	public Student() {
		System.out.println("inside no-arg constructor!!!");
	}

	public Student(int rollNumber, String name, String address) {
		super();
		System.out.println("inside all-arg constructor!!!");
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		System.out.println("inside setter of roll number");
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("inside setter of name");
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		System.out.println("inside setter of address");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}

	
	
}
