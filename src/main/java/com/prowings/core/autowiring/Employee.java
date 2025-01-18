package com.prowings.core.autowiring;

public class Employee {

	private int id;
	private String name;
	private Department department;

//	public Employee() {
//		System.out.println("no-arg constructor of Employee called!!");
//	}

	public Employee(Department department) {
		super();
		System.out.println("Employee(Department department) constructor of Employee called!!");
		this.department = department;
	}

	public Employee(int id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter of Employee -> id called!!");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter of Employee -> name called!!");
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		System.out.println("setter of Employee -> department called!!");
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
}
