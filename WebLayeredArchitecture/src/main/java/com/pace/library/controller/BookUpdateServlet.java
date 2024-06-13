package com.pace.library.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pace.library.bean.Book;
import com.pace.library.dao.BookDAO;

/**
 * Servlet implementation class BookDeleteServlet
 */
public class BookUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookDAO bookDao = new BookDAO();
		Book book = new Book();
		boolean rows = false;
		int id;
		String name, author;
		float price;
		
		id = Integer.parseInt(request.getParameter("id"));
		PrintWriter out = response.getWriter();
		out.println("Book id" + id);
		try {
			rows = bookDao.updateBook(id);
		}catch(Exception e) {
			System.out.println("Could not update book!");
		}
		if(rows == true) {
			System.out.println("Book data successfully updated");
		}else {
			System.out.println("Book data could not update");
		}
		RequestDispatcher dis = request.getRequestDispatcher("updateSuccess.html");
		dis.forward(request, response);
	}

}
