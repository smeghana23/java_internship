package com.pace.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.pace.library.entity.Book;
import com.pace.library.helper.DbConnector;

public class BookDAO{
	private Connection connection = null;
	private PreparedStatement pstatement = null;
	private ResultSet resultSet = null;
	private Statement statement = null;
	
	ArrayList <Book> bookList = null;
	private static String bookQry = "Select * from book";
	//get book details
	public ArrayList <Book> getBooks() throws ClassNotFoundException, SQLException{
		try {
			connection = DbConnector.createConnection();
			pstatement = connection.prepareStatement(bookQry);
			resultSet = pstatement.executeQuery();
			Book book;
			bookList = new ArrayList<Book>();
			while(resultSet.next()) {
				int bookId;
				String bookName;
				String author;
				float price;
				//declare the pojo
				book = new Book();
				bookId = resultSet.getInt(1);
				bookName = resultSet.getString(2);
				author = resultSet.getString(3);
				price = resultSet.getFloat(4);
				book.setId(bookId);
				book.setName(bookName);
				book.setAuthor(author);
				book.setPrice(price);
				bookList.add(book);
				book = null;
			}
		}catch(SQLException sqlex) {
			
		}finally {
			DbConnector.closeConnection();
		}
		return bookList;
	}
	//show book details
	public void showBookList(ArrayList<Book>bookList2) {
		System.out.println("In DAO layer");
		for(Book book : bookList2) {
			System.out.print(book.getId());
			System.out.print("\t" + book.getName());
			System.out.print("\t" + book.getAuthor());
			System.out.println("\t" + book.getPrice());
		}
	}
	//inserting data into book
	public void insertBookDetails(Book book) throws ClassNotFoundException, SQLException{
		connection = DbConnector.createConnection();
		String insQry = "insert into book values(?, ?, ?, ?)";
		pstatement = connection.prepareStatement(insQry);
		pstatement.setInt(1, book.getId());
		pstatement.setString(2, book.getName());
		pstatement.setString(3, book.getAuthor());
		pstatement.setFloat(4, book.getPrice());
		
		int rows = pstatement.executeUpdate();
		System.out.println(rows + "Rows Inserted!");
		DbConnector.closeConnection();
	}
	//deleting data from book
	public boolean deleteBook(int id) throws SQLException, ClassNotFoundException{
		pstatement = null;
		connection = DbConnector.createConnection();
		String delQry = "delete from book where id = ?";
		pstatement = connection.prepareStatement(delQry);
		pstatement.setInt(1, id);
		int rows = pstatement.executeUpdate();
		boolean isDelete = true;
		if(rows != 0) {// if rows is non-zero, it is deleted
			isDelete = true;// status of deletion
		}else {
			isDelete = false;//status of deletion
		}
		DbConnector.closeConnection();
		return isDelete;
	}
	//updating data of book
	public boolean updateBook(int id) throws SQLException, ClassNotFoundException{
		pstatement = null;
		connection = DbConnector.createConnection();
		String updPriceQry = "update book set price = price + price * 0.10 where id = ?";
		pstatement = connection.prepareStatement(updPriceQry);
		pstatement.setInt(1, id);
		int rows = pstatement.executeUpdate();
		boolean isUpdate = true;
		if(rows != 0) {
			isUpdate = true;
		}else {
			isUpdate = false;
		}
		DbConnector.closeConnection();
		return isUpdate;
	}
	//updating 2 book details
	public boolean updateBookByPriceSlash() throws SQLException, ClassNotFoundException{
		statement = null;
		connection = DbConnector.createConnection();
		statement  = connection.createStatement();
		String updateQry = 
		        "update book set price = case name " +
		        "when 'Alchemist' then price - price * (34.28 / 100) " +
		        "when 'Computer Networks' then price - price * (3.2 / 100) " +
		        "else price end " +
		        "where name in('Alchemist', 'Computer Networks')";
		int rows = statement.executeUpdate(updateQry);
		boolean isUpdate = true;
		if(rows != 0) {
			isUpdate = true;
		}else {
			isUpdate = false;
		}
		DbConnector.closeConnection();
		return isUpdate;
	}	
}