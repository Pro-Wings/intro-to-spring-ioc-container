package com.prowings.core.autowiring;

public class Department {
	
	private int id;
	private String deptName;
	private String deptBuilding;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setter of Department -> id called!!");
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		System.out.println("setter of Department -> deptName called!!");
		this.deptName = deptName;
	}
	public String getDeptBuilding() {
		return deptBuilding;
	}
	public void setDeptBuilding(String deptBuilding) {
		System.out.println("setter of Department -> deptBuilding called!!");
		this.deptBuilding = deptBuilding;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", deptBuilding=" + deptBuilding + "]";
	}
}
