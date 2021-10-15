package org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.openqa.selenium.WebDriver;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		
		
		//1. Load The Driver
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		//2. Connet to database
		 Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
		 
		//3. Write sql Query
		 
		 String s="select * from greens";
		 
		//4. prepare statement 
		 PreparedStatement ps = c.prepareStatement(s);
		 
		//5. Execute query
		 ResultSet ex = ps.executeQuery();
		 
		//6. Itrate result
		 while (ex.next()) {
			int sid = ex.getInt("stid");
			long phno = ex.getLong("phno");
			String stname = ex.getString("stname");
			
			System.out.println("\nStudent Name : "+stname);
			System.out.println("Student id : "+sid);
			System.out.println("Student PhNo : "+phno);
		}
		 c.close();
	}
}
