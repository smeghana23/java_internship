package com.pace.library.helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//HELPER class to handle DATACONNECTIVITY in MYSQL
public class DbConnector {
	//NEW instance of connection
	private static Connection connection = null;
	
	//opening connection with MYSQL database
	public static Connection createConnection() throws ClassNotFoundException,SQLException{
		String url, userId, passWord;
		url = "jdbc:mysql://@localhost:3306/library";
		userId = "root";
		passWord = "Manchi@964";
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, userId, passWord);
		return connection;
	}
	//closing connection
	public static void closeConnection() throws SQLException{
		connection.close();
	}
}
