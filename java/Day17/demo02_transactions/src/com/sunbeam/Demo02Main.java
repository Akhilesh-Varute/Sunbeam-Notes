package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-23 10:03
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
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("From Acc Id: ");
		int fromId = sc.nextInt();
		System.out.println("To Acc Id: ");
		int toId = sc.nextInt();
		int cnt1, cnt2;
		Connection con = null;
		try {
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
			// tx start
			con.setAutoCommit(false);
			String sql = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			// execute statement to debit from account
			stmt.setDouble(1, -amount);
			stmt.setInt(2, fromId);
			cnt1 = stmt.executeUpdate();
			// execute statement to credit into account
			stmt.setDouble(1, +amount);
			stmt.setInt(2, toId);
			cnt2 = stmt.executeUpdate();
			// check if operation is successful
			if(cnt1 != 1 || cnt2 != 1)
				throw new RuntimeException("Transaction failed.");
			// tx success
			con.commit();
		} catch (Exception e) {
			// tx failed
			if(con != null)
				con.rollback();
			e.printStackTrace();
		} finally {
			if(con != null)
				con.close();
		}
	}
}













