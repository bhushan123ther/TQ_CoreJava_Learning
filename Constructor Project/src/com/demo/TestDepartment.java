package com.demo;

import java.util.Scanner;

public class TestDepartment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Department d1 = new Department(101, "HR", "Mumbai");
		System.out.println(d1.getDeptId() + " " + d1.getDname() + " " + d1.getLocation());

		d1.setLocation("Pune");
		System.out.println(d1.getDeptId() + " " + d1.getDname() + " " + d1.getLocation());

		Department d2 = new Department(102, "Admin");
		// System.out.println(d2.toString());-- hashcode

		System.out.println(d2);

	}

}
