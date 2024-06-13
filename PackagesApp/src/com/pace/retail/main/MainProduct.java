package com.pace.retail.main;

import com.pace.retail.Product;

public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product mobile = 
				new Product(123,"iPhone",1245.97f);
		Product laptop =
				new Product(145,"Mac Book",12343.56f);
		System.out.println("Mobile Phone Details");
		System.out.println(mobile.getId());
		System.out.println(mobile.getName());
		System.out.println(mobile.getPrice());
		
		System.out.println("Laptop Details");
		System.out.println(laptop.getId());
		System.out.println(laptop.getName());
		System.out.println(laptop.getPrice());
        // update price
		mobile.setPrice(1590.908f);
		System.out.println(mobile.getPrice());
	}

}
