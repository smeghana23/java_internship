package com.pace.dao;

import java.util.ArrayList;

import com.pace.bean.Product;

public class ProductDAO {
	ArrayList<Product> productList = new ArrayList<Product>();
	
    public void addProducts(Product product) {
        productList.add(product);
    }
    
    public ArrayList<Product> getProducts() {
        return productList;
    }
}
