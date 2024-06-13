package com.pace.library.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * HELPER class to handle DATACONNECTIVITY with 'sample' Data Base in MYSQL
 */
public class DbConnector {
	
	// New instance of Connection
	private static Connection connection = null;

	// Opening connection with MYSQL database
	public static Connection createConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// If error occurs type the following code
		//Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/library","root","Manchi@964");
		return connection;
	}

	// Closing connection
	public static void closeConnection() throws SQLException {
		connection.close();
	}
}