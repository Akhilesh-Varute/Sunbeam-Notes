package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-22 10:02
 */

public class Demo01Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String DB_USER = "nilesh";
	public static final String DB_PASSWD = "nilesh";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/*
	// DML/DDL query execution -- DEMO
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try(Statement stmt = con.createStatement()) {
				System.out.print("Enter Name: ");
				String name = sc.next();
				System.out.print("Enter Party: ");
				String party = sc.next();
				System.out.print("Enter Votes: ");
				int votes = sc.nextInt();
				//String sql = "INSERT INTO candidates VALUES(default,'Nilesh','NA',1)";
				//String sql = "INSERT INTO candidates VALUES(default,'"+name+"','"+party+"',"+votes+")";
				String sql = String.format("INSERT INTO candidates VALUES(default, '%s', '%s', %d)", name, party, votes);
				//System.out.println(sql);
				int cnt = stmt.executeUpdate(sql);
				System.out.println("Rows affected: " + cnt); // 1
			} //stmt.close();
		} //con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	/*
	// SELECT query execution -- DEMO
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try(Statement stmt = con.createStatement()) {
				String sql = "SELECT * FROM candidates";
				try(ResultSet rs = stmt.executeQuery(sql)) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String party = rs.getString("party");
						int votes = rs.getInt("votes");
						System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
					}
				} // rs.close();
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	// SQL Injection - DEMO
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			try(Statement stmt = con.createStatement()) {
				System.out.print("Enter candidate id to be deleted: ");
				String id = sc.nextLine();
				String sql = "DELETE FROM candidates WHERE id=" + id;
				System.out.println(sql);
				int cnt = stmt.executeUpdate(sql);
				System.out.println("Rows affected: " + cnt);
			} //stmt.close();
		} //con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "nilesh", "nilesh");
		
		Statement stmt = con.createStatement();
		
		String sql = "SELECT * FROM candidates";
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String party = rs.getString("party");
			int votes = rs.getInt("votes");
			System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
		}
		rs.close();
		
		stmt.close();
		con.close();
	}
	*/
}
