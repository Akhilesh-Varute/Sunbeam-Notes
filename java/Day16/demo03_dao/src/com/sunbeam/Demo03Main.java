package com.sunbeam;

import java.util.List;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam Karad Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-22 12:53
 */

public class Demo03Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id to be deleted: ");
			int id = sc.nextInt();
			int cnt = dao.deleteById(id);
			System.out.println("Candidates deleted: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try(CandidateDao dao = new CandidateDao()) {
			List<Candidate> list = dao.findAll();
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/

		/*
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter party: ");
			String party = sc.next();
			List<Candidate> list = dao.findByParty(party);
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id (to vote): ");
			int candidateId = sc.nextInt();
			int cnt = dao.incrementVote(candidateId);
			System.out.println("Rows updated: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}






