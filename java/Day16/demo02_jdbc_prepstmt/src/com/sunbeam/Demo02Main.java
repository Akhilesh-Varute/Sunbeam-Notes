package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-22 11:34
 */

public class Demo02Main {
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
	
	static Date parseDate(String str) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date = sdf.parse(str);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	static void addUser() {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			String sql = "INSERT INTO users VALUES(default, ?, ?, ?, ?, ?, false, 'voter')";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				System.out.print("First Name: ");
				String fname = sc.next();
				System.out.print("Last Name: ");
				String lname = sc.next();
				System.out.print("Email: ");
				String email = sc.next();
				System.out.print("Password: ");
				String passwd = sc.next();
				System.out.print("Birth Date (dd-MM-yyyy): ");
				String bdate = sc.next();
				Date utilDate = parseDate(bdate);
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
				stmt.setString(1, fname);
				stmt.setString(2, lname);
				stmt.setString(3, email);
				stmt.setString(4, passwd);
				stmt.setDate(5, sqlDate);
				int cnt = stmt.executeUpdate();
				System.out.println("Rows inserted: " + cnt);
			} //stmt.close();
		} //con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteUser() {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			String sql = "DELETE FROM users WHERE id = ?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				System.out.print("Enter user id to be deleted: ");
				int id = sc.nextInt();
				stmt.setInt(1, id);
				int cnt = stmt.executeUpdate();
				System.out.println("Rows deleted: " + cnt);
			} //stmt.close();
		} //con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateUser() {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			String sql = "UPDATE users SET first_name=?, last_name=?, password=?, dob=? WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				System.out.print("User Id to be updated: ");
				int id = sc.nextInt();
				System.out.print("First Name: ");
				String fname = sc.next();
				System.out.print("Last Name: ");
				String lname = sc.next();
				System.out.print("Password: ");
				String passwd = sc.next();
				System.out.print("Birth Date (dd-MM-yyyy): ");
				String bdate = sc.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date uDate = sdf.parse(bdate);
				java.sql.Date sDate = new java.sql.Date( uDate.getTime() );
				
				stmt.setString(1, fname);
				stmt.setString(2, lname);
				stmt.setString(3, passwd);
				stmt.setDate(4, sDate);
				stmt.setInt(5, id);
				
				int cnt = stmt.executeUpdate();
				System.out.println("Rows updated: " + cnt);				
			} //stmt.close();
		} //con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void displayAll() {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			String sql = "SELECT * FROM users";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String fname = rs.getString("first_name");
						String lname = rs.getString("last_name");
						String email = rs.getString("email");
						boolean status = rs.getBoolean("status");
						java.sql.Date sDate = rs.getDate("dob");
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						String bdate = sdf.format(sDate);
						System.out.printf("%d, %s %s, %s, %s, %s\n", id, fname, lname, email, status, bdate);
					}
				} // rs.close();
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//addUser();
		//deleteUser();
		//updateUser();
		displayAll();
	}
}















