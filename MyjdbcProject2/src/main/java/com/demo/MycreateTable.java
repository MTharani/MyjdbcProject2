package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MycreateTable {

	public static void main(String[] args) 
	{
		String table=("create table studentmark(sid int(4) primary key,sname varchar(30),tamil int(10),english int(30),math int(30),science int(30))");
		 String driver="com.mysql.cj.jdbc.Driver";
		 String url="jdbc:mysql://localhost:3306/exam";
		 String un="root";
		 String pass="root";
		 
		 try {
			 Class.forName(driver);	
			 Connection conn=DriverManager.getConnection(url,un,pass);
			 Statement st=conn.createStatement();
			 st.execute(table);
			 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
         
         
        
	}

}
