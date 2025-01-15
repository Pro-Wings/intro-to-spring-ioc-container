package com.prowings.core;

public class Person {
	
	private int id;
	private String name;
	private String address;

	public Person() {
		System.out.println("inside no-arg constructor!!");
	}

	public Person(int id, String name, String address) {
		super();
		System.out.println("inside (int id, String name, String address) constructor!!");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Person(String name, String address) {
		super();
		System.out.println("inside (String name, String address) constructor!!");
		this.name = name;
		this.address = address;
	}

	public Person(int id, String address) {
		super();
		System.out.println("inside (int id, String address) constructor!!");
		this.id = id;
		this.address = address;
	}

	public Person(String name) {
		super();
		System.out.println("inside (String name) constructor!!");
		this.name = name;
	}

	public Person(int id) {
		super();
		System.out.println("inside (int id) constructor!!");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


	
	
}
