package com.pace.retail;
public class Product {
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
//setter is used to update the instance variable value
//getter return instance variable value
//constructor used to intialize the value
//package naming convention - company name.project name.moddule name