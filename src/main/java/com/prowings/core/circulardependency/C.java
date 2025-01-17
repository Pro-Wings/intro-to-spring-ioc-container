package com.prowings.core.circulardependency;

import java.util.Map;

public class C {
	
	private int id;
	private String name;
	
	private Map<String, Integer> subjectWiseMarks;
	
	

	public Map<String, Integer> getSubjectWiseMarks() {
		return subjectWiseMarks;
	}
	public void setSubjectWiseMarks(Map<String, Integer> subjectWiseMarks) {
		this.subjectWiseMarks = subjectWiseMarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("inside setter of C-id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("inside setter of C-name");
		this.name = name;
	}
	@Override
	public String toString() {
		return "C [id=" + id + ", name=" + name + ", subjectWiseMarks=" + subjectWiseMarks + "]";
	}

	
}
