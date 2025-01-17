package com.prowings.core.circulardependency;

import java.util.List;

public class A {
	
	private int id;
	private String name;
	private List<String> subjects;
	
	
	
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("inside setter of A-id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("inside setter of A-name");
		this.name = name;
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
	}

}
