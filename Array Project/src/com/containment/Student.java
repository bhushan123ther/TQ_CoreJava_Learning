package com.containment;

import java.util.Arrays;

public class Student {

	private int id;
	private String name;
	private float marks[];
	private Course crs;

	public Student() {
		super();
	}

	public Student(int id, String name, float[] marks, Course crs) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.crs = crs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float[] getMarks() {
		return marks;
	}

	public void setMarks(float[] marks) {
		this.marks = marks;
	}

	public Course getCrs() {
		return crs;
	}

	public void setCrs(Course crs) {
		this.crs = crs;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", crs=" + crs + "]";
	}

}
