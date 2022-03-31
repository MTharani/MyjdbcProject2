package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class MyInsert {

	public static void main(String[] args) 
	{
		int sid,tamil,english,math,science;
		String sname, input;
		Scanner sc=new Scanner(System.in);
		//infinite loop
		while(true) 
		{
			System.out.println("Enter the student id:");
			sid=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the student name:");
			sname=sc.next();
			System.out.println("enter the tamil mark:");
			tamil=sc.nextInt();
			System.out.println("enter the english mark:");
			english=sc.nextInt();
			System.out.println("enter the math mark:");
			math=sc.nextInt();
			System.out.println("enter the science mark:");
			science=sc.nextInt();
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/exam";
			String un="root";
			String pass="root";
			//connect the database
			try
			{
				Class.forName(driver);
				Connection conn=DriverManager.getConnection(url,un,pass);
				Statement st=conn.createStatement();
				String ins="insert into studentmark values("+sid+", '"+sname+"',"+tamil+", "+english+", "+math+", "+science+")";
				int i=st.executeUpdate(ins);
				if(i>0)
				{
					System.out.println("Record Insert Sucessfully");
				}
				else
				{
					System.out.println("Not Inserted");
				}

			}catch(Exception e)
			{
				e.printStackTrace();
			}
             //break infinite loop
			System.out.println("are u enter again yes/no");
			input=sc.next();
			if("no".equals(input)||"No".equals(input))
			{

				System.out.println("thank you ");
				break;
			}
		}
		
		

	}

}
