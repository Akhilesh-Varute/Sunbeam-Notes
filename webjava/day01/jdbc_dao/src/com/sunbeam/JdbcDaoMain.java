package com.sunbeam;

import java.util.List;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.pojos.Candidate;

public class JdbcDaoMain {
	/*
	public static void main(String[] args) {
		try(CandidateDao cDao = new CandidateDaoImpl()) {
			List<Candidate> list = cDao.findAll();
			list.forEach(e -> System.out.println(e));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	/*
	public static void main(String[] args) {
		try(CandidateDao cDao = new CandidateDaoImpl()) {
			List<Candidate> list = cDao.findByParty("BJP");
			list.forEach(e -> System.out.println(e));
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	*/
	/*
	public static void main(String[] args) {
		try(CandidateDao cDao = new CandidateDaoImpl()) {
			Candidate c = cDao.findById(1);
			if(c == null)
				System.out.println("Candidate Not Found");
			else
				System.out.println("Found: " + c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	*/
	public static void main(String[] args) {
		try(CandidateDao cDao = new CandidateDaoImpl()) {
			Candidate c = new Candidate(0, "Sarvesh", "Sunbeam", 65);
			int count = cDao.save(c);
			System.out.println("Candidates Saved: " + count);
		}
		catch (Exception e) {
			e.printStackTrace();
		}				
	}
}
