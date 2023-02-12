package com.demo;

/*10)Create one class Employee (emp_id, name, sal) with private access specifier and create getter and setter. */

public class Employee {
	private int emp_id;
	private String name;
	private float sal;

	public void setEmp_Id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getEmp_Id() {
		return emp_id;
	}

	public void setName(String emp_name) {
		this.name = emp_name;
	}

	public String getName() {
		return name;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public float getSal() {
		return sal;
	}
}
