package com.sunbeam.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String DB_USER = "nilesh";
	public static final String DB_PASSWORD = "nilesh";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	}
}
