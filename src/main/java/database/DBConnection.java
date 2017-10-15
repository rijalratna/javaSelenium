package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
Connection con;
Statement st;
PreparedStatement pst;
	public DBConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/selenium","root","");
			System.out.println(con);
//			String s="INSERT INTO `signup` (`fname`, `lname`, `username`, `email`, `password`, `cpassword`, `phone`) VALUES ('a', 'a', 'c', 'a', 'a', 'a', 'a')";
			System.out.println("--Database Connection sucsess--");
//			PreparedStatement pst=(PreparedStatement) con.prepareStatement(s);
//			pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			System.out.println("--something error--");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException {
		System.out.println("main----");
		DBConnection db=new DBConnection();
		System.out.println(db);

	}

}
