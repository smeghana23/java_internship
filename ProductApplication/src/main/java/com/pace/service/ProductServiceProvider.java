package com.pace.service;

import java.util.ArrayList;

import com.pace.bean.Product;
import com.pace.dao.ProductDAO;

public class ProductServiceProvider {
	
	private ProductDAO productDAO = new ProductDAO();
	
    public void addProducts(Product product) {
        productDAO.addProducts(product);
    }
    
    public ArrayList<Product> getProducts() {
        return productDAO.getProducts();
    }

}
