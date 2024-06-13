package com.pace.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pace.bean.Product;
import com.pace.service.ProductServiceProvider;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int productid = Integer.parseInt(request.getParameter("productid"));
		String productname = request.getParameter("productname");
		float productprice = Float.parseFloat(request.getParameter("productprice"));
		
		Product product = new Product(productid, productname, productprice);
		
		ProductServiceProvider productServiceProvider = new ProductServiceProvider();
		productServiceProvider.addProducts(product);
		
		ArrayList<Product> productList = productServiceProvider.getProducts();
        request.setAttribute("productList", productList);
        RequestDispatcher dis = request.getRequestDispatcher("products.jsp");
		dis.forward(request, response);

	}

}
