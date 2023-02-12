package com.demo;

public class Department {
	private int deptId;
	private String dname;
	private String location;

	// default constructor
	public Department() {
		System.out.println("In default constructor");
	}

	// parameterized constructor
	public Department(int deptId, String dname, String location) {
		System.out.println("In parameterized constructor 1");
		this.deptId = deptId;
		this.dname = dname;
		this.location = location;
	}

	// parameterized constructor
	public Department(int deptId, String dname) {
		System.out.println("In parameterized constructor 2");
		this.deptId = deptId;
		this.dname = dname;
		this.location = "New Delhi";
	}

	// getter and setter values
	public void setDeptId(String dname) {
		this.dname = dname;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDname() {

		return dname;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocation() {

		return location;
	}

	public String toString() {
		return "Department details: " + deptId + "  " + dname + "  " + "  " + location;
	}
}
