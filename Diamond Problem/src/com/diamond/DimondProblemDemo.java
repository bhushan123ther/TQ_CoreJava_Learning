package com.diamond;

interface Person {
	default void display() {
		System.out.println("I am Normal Person");
	}
}

interface Actor {
	default void display() {
		System.out.println("I am Actor");
	}
}

public class DimondProblemDemo implements Person, Actor {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Actor.super.display();
		Person.super.display();
	}

	public static void main(String[] args) {
		DimondProblemDemo act1 = new DimondProblemDemo();
		act1.display();
	}

}
