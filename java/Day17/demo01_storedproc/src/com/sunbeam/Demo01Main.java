package com.sunbeam;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-23 09:06
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
	// CALL sp_getpartycandidates('SP');
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			String sql = "CALL sp_getpartycandidates(?)";
			try(CallableStatement stmt = con.prepareCall(sql)) {
				System.out.print("Enter party: ");
				String party = sc.next();
				stmt.setString(1, party);
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						party = rs.getString("party");
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
	
	/*
	// CALL sp_incrementcandidatevotes(3);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			String sql = "CALL sp_incrementcandidatevotes(?)";
			try(CallableStatement stmt = con.prepareCall(sql)) {
				System.out.print("Enter Candidate Id: ");
				int candId = sc.nextInt();
				stmt.setInt(1, candId);
				int cnt = stmt.executeUpdate();
				System.out.println("Rows affected: " + cnt);
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	*/
	
	//CALL sp_getpartytotalvotes('BJP', @totalvotes);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD)) {
			String sql = "CALL sp_getpartytotalvotes(?,?)";
			try(CallableStatement stmt = con.prepareCall(sql)) {
				System.out.print("Enter Party: ");
				String party = sc.next();
				stmt.setString(1, party);	// IN param of SP -- to be set
				stmt.registerOutParameter(2, Types.INTEGER); // OUT param of SP -- to be registered
				stmt.execute();
				int totalVotes = stmt.getInt(2); // collect value of OUT param
				System.out.println("Total Votes for " + party + " = " + totalVotes);
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}				
	}
}

/*
-- Write this Stored Procedure in MySQL:

DELIMITER $$

CREATE PROCEDURE sp_getpartycandidates(p_party VARCHAR(20))
BEGIN
	SELECT * FROM candidates WHERE party=p_party;
END;
$$

DELIMITER ;

CALL sp_getpartycandidates('SP');

--------------------------------------------------------------------------

DELIMITER $$

CREATE PROCEDURE sp_incrementcandidatevotes(p_candidateid INT)
BEGIN
	UPDATE candidates SET votes = votes + 1 WHERE id = p_candidateid; 
END;
$$

DELIMITER ;

CALL sp_incrementcandidatevotes(3);

--------------------------------------------------------------------------

DELIMITER $$

CREATE PROCEDURE sp_getpartytotalvotes(p_party VARCHAR(20), OUT p_votes INT)
BEGIN
	SELECT SUM(votes) INTO p_votes FROM candidates WHERE party=p_party;
END;
$$

DELIMITER ;

CALL sp_getpartytotalvotes('BJP', @totalvotes);
SELECT @totalvotes;
*/



















