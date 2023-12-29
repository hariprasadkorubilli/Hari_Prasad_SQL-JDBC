package com.gl.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/GL", "root", "Hari@92748");
		
		PreparedStatement pstmt1 = conn.prepareStatement("insert into employee values (?,?,?,?)");
		
		int id1 = 1;
		String name1 = "SAGAR";
		String email1 = "sagar1111@gmail.com";
		String Phone1 = "7902165841";
		
		pstmt1.setInt(1, id1);
		pstmt1.setString(2, name1);
		pstmt1.setString(3, email1);
		pstmt1.setString(4, Phone1);
		
		int rowCount1 = pstmt1.executeUpdate();
		System.out.println(rowCount1+ " Row inserted");
		
		PreparedStatement pstmt2 = conn.prepareStatement("insert into employee values (?,?,?,?)");
		
		int id2 = 2;
		String name2 = "RAJESH";
		String email2 = "rajesh2222@gmail.com";
		String Phone2 = "7902165842";
		
		pstmt2.setInt(1, id2);
		pstmt2.setString(2, name2);
		pstmt2.setString(3, email2);
		pstmt2.setString(4, Phone2);
		
		int rowCount2 = pstmt2.executeUpdate();
		System.out.println(rowCount2 + " Row inserted");
		
		PreparedStatement pstmt3 = conn.prepareStatement("insert into employee values (?,?,?,?)");
		
		int id3 = 3;
		String name3 = "SURESH";
		String email3 = "suresh3333@gmail.com";
		String Phone3 = "7902165843";
		
		pstmt3.setInt(1, id3);
		pstmt3.setString(2, name3);
		pstmt3.setString(3, email3);
		pstmt3.setString(4, Phone3);
		
		int rowCount3 = pstmt3.executeUpdate();
		System.out.println(rowCount3 + " Row inserted");
		
		PreparedStatement pstmt4 = conn.prepareStatement("insert into employee values (?,?,?,?)");
		
		int id4 = 4;
		String name4 = "RAMESH";
		String email4 = "ramesh4444@gmail.com";
		String Phone4 = "7902165844";
		
		pstmt4.setInt(1, id4);
		pstmt4.setString(2, name4);
		pstmt4.setString(3, email4);
		pstmt4.setString(4, Phone4);
		
		int rowCount4 = pstmt4.executeUpdate();
		System.out.println(rowCount4 + " Row inserted");
		
		PreparedStatement pstmt5 = conn.prepareStatement("insert into employee values (?,?,?,?)");
		
		int id5 = 5;
		String name5 = "RAKESH";
		String email5 = "rakesh5555@gmail.com";
		String Phone5 = "7902165845";
		
		pstmt5.setInt(1, id5);
		pstmt5.setString(2, name5);
		pstmt5.setString(3, email5);
		pstmt5.setString(4, Phone5);
		
		int rowCount5 = pstmt5.executeUpdate();
		System.out.println(rowCount5 + " Row inserted");
		
		
		PreparedStatement pstmt51 = conn.prepareStatement("alter table employee modify column email_id varchar(30)");
		
		pstmt51.executeUpdate();
		
		System.out.println("1 row affected");
		
		PreparedStatement pstmt6 = conn.prepareStatement("insert into employee values (?,?,?,?)");
		
		int id6 = 6;
		String name6 = "Devaratha";
		String email6 = "devashouryanga@gmail.com";
		String Phone6 = "7264358102";
		
		pstmt6.setInt(1, id6);
		pstmt6.setString(2, name6);
		pstmt6.setString(3, email6);
		pstmt6.setString(4, Phone6);
		
		int rowCount6 = pstmt6.executeUpdate();
		System.out.println(rowCount6 + " Row inserted");
		
		PreparedStatement pstmt7 = conn.prepareStatement("insert into employee values (?,?,?,?)");
		
		int id7 = 7;
		String name7 = "Varadha";
		String email7 = "varadha1982@gmail.com";
		String Phone7 = "9425183620";
		
		pstmt7.setInt(1, id7);
		pstmt7.setString(2, name7);
		pstmt7.setString(3, email7);
		pstmt7.setString(4, Phone7);
		
		int rowCount7 = pstmt7.executeUpdate();
		System.out.println(rowCount7 + " Row inserted");
		

		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from employee");
		
		PreparedStatement pstmt8 = conn.prepareStatement("update table set name = ? and phone_number = ? where id = ?");
		String name8 = "Karthik";
		String phone8 = "1234567890";
		int id8 = 3;
		
		pstmt8.setString(1, name8);
		pstmt8.setString(2, phone8);
		pstmt8.setInt(3, id8);
		int rowCount8 = pstmt8.executeUpdate();
		
		System.out.println(rowCount8 + " row affected");
		
		PreparedStatement pstmt9 = conn.prepareStatement("Delete from employee where id = 3 and 4");
		
		pstmt9.executeUpdate();
		
		System.out.println("1 row affected");
		
		
		PreparedStatement pstmt10 = conn.prepareStatement("truncate table employee");

		pstmt10.executeQuery();
		System.out.println("All rows affected!");
		pstmt6.close();
		conn.close();
		

	}

}