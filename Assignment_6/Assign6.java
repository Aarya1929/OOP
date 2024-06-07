//SQL
package Assignment_6;
import java.sql.*;
import java.util.*;

class Assign6 {
	static String url="jdbc:mysql://localhost:3306/students";
	static String user="root";
	static String pwd="";
	
	static Scanner sc=new Scanner(System.in);
	
	public static void addr() {
		System.out.println("Enter Roll No: ");
		int rno = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String sname = sc.next();
		
		System.out.println("Enter Age: ");
		int sage = sc.nextInt();
		
		System.out.println("Enter Course: ");
		String scourse = sc.next();
		
		System.out.println("Enter Hobby: ");
		String shobby = sc.next();
		
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 Statement st=con.createStatement();
			 
			 String sqlInsert="insert into students values('"+rno+"','"+sname+"','"+sage+"','"+scourse+"','"+shobby+"')";
			 st.executeUpdate(sqlInsert);
			 System.out.println("Record inserted successfully");			 
			 
			 con.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public static void updater() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pwd);
			Statement st=con.createStatement();
			 
			String sqlupdate="update students set Name='ABC' where Roll_no=2";
			st.executeUpdate(sqlupdate);
			System.out.println("Record updated successfully");		 
			 
			 con.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public static void deleter() {
		
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 Statement st=con.createStatement();
			 
			 String sqldelete="delete from students where Roll_no=1";
			 st.executeUpdate(sqldelete);
			 System.out.println("Record deleted successfully");	 
			 
			 con.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public static void showr() {

		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 Statement st=con.createStatement();
			 
			 String sql="select * from students";
			 ResultSet rs= st.executeQuery(sql);
			 while(rs.next()) {
				 System.out.print("RollNo: "+rs.getInt(1));
				 System.out.print(" Name: "+rs.getString(2));
				 System.out.print(" Age: "+rs.getInt(3));
				 System.out.print(" Course: "+rs.getString(4));
				 System.out.print(" Hobby: "+rs.getString(5));
				 System.out.println("");
			 }	 
				 con.close();
			 
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public static void main(String[] args) {
		
		int exit;
		String ex;
		
		do
		{
			System.out.println("MENU:\n1.ADD RECORD\t2.UPDATE RECORD\t3.DELETE RECORD\t4.SHOW RECORD");
			System.out.println("Enter your Choice:");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				addr();
				break;
			case 2:	
				updater();
				break;
			case 3:
				deleter();
				break;
			case 4:
				showr();
				break;
			default:
				System.out.println("Wrong choice.");
				break;
			}
			System.out.println("Do you wish to continue(y/n)?");
		    ex =sc.next() ;
		}while(ex.equals("y"));
		
}

}






/*
Assignment-6 Console Based JDBC

import java.sql.*;
import java.util.*;
class Assignment6 {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/students";
		String user="root";
		String pwd="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollNo: ");
		int rno = sc.nextInt();
		
		System.out.println("Enter Sname: ");
		String sname = sc.next();
		
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con=DriverManager.getConnection(url,user,pwd);
			 Statement st=con.createStatement();
			 
			 String sqlInsert="insert into stud values('"+rno+"','"+sname+"')";
			 st.executeUpdate(sqlInsert);
			 System.out.println("record inserted successfully");
			 
			 
			 String sql="select * from stud";
			 ResultSet rs= st.executeQuery(sql);
			 while(rs.next()) {
				 System.out.println("RollNo: "+rs.getInt(1));
				 System.out.println("Sname: "+rs.getString(2));
				 
			 }
//
//			 String sqlupdate="update CSA1 set sname='ABC' where rno=10";
//			 st.executeUpdate(sqlupdate);
//			 System.out.println("record updated successfully");
//			 
//			 
//			 String sqldelete="delete from CSA1 where rno=1";
//			 st.executeUpdate(sqldelete);
//			 System.out.println("record deleted successfully");
//			 
			 
			 
			 con.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
	}

}*/
