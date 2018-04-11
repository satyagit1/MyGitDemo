package com.jlcindia.jdbc;
import java.sql.*;
public class lab1 {

	public static void main(String[] args) {
	Connection con=null;
	Statement st=null;
	try {
		//load the driver class
		Class.forName("com.mysql.jdbc.Driver");
		//establish the connection
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/samdb","root","jlcindia");
		//prepare the SQL statement
		String sql="insert into user values(101,'satyabrata','smohapatra91@yahoo',916485009,'1991-12-11')";
		//create the JDBC statement
		st=con.createStatement();
		//submit the SQL statement using JDBC statement
		int x=st.executeUpdate(sql);
		//process the result
		if (x==1) {
			System.out.println("record inserted");
		}else {
			System.out.println("no record found");
		}
			
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try {
			if(st!=null)st.close();
			if(con!=null)con.close();
			
		}catch(Exception e){
			e.printStackTrace();
	}

	}
	}
}
