package com.objectInputOutput;

import java.io.Serializable;

public class Book implements Serializable {

	int bid;
	String name;
	float price;

	public Book() {
		super();
	}

	public Book(int bid, String name, float price) {
		super();
		this.bid = bid;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return "Book [bid = " + bid + " , name = " + name + " , price = " + price + " ]";
	}
}
