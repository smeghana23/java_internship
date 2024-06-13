package com.pace.jdbc;

public class MainReadData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ReadData data = new ReadData();
		
		data.registerDriver();
		data.getDetails();
		
	}

}
//jdbc prepared statements - used to execute parameterized queries.
//preparedStatement stmt = con.prepareStatement("insert into book values(?,?,?);
//stmt.setInt(1,50);
//stmt.setString(2,"logistics");
//stmt.setString(3,"Las vegas");
//int rowCount = stmt.executeUpdate();
