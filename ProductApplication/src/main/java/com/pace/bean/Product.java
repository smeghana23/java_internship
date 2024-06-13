package com.pace.bean;

public class Product {
	int productid;
	String productname;
	float productprice;
	
	public Product(int productid, String productname, float productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public float getProductprice() {
		return productprice;
	}

	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}

	
	

}
