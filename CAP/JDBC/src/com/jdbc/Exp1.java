package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Exp1 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ja4","root","ammulu15");
		Statement stmt=con.createStatement();
		String sql="create table ja4jdbc(id int,name varchar(150),city varchar(150))";
		
		stmt.execute(sql);
		System.out.println("Done..!");
		con.close();

	}

}
