package com.cons_chain;

public class Customer {
	private int cid;
	private String cname, item_name, status, phoneNum;
	private float price;

	public Customer() {
		System.out.println("In default constructor");
		this.item_name = null;
		this.status = "unknwon";
		this.price = 0.0f;
	}

	public Customer(int cid, String cname, String phoneNum) {
		this();
		System.out.println("In parameterized constructor 1");
		this.cid = cid;
		this.cname = cname;
		this.phoneNum = phoneNum;

	}

	public Customer(int cid, String cname, String item_name, String phoneNum, float price, String status) {
		this(cid, cname, phoneNum);
		System.out.println("In parameterized constructor 2");
		this.item_name = item_name;
		this.status = status;
		this.price = price;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getCid() {
		return cid;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCname() {
		return cname;
	}

	public void setItemName(String item_name) {
		this.item_name = item_name;
	}

	public String getItemName() {
		return item_name;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public String toString() {
		return "Customer Details:" + cid + " " + cname + " " + phoneNum + "\t Item Details :  " + item_name + " "
				+ price + " " + status;
	}
}
