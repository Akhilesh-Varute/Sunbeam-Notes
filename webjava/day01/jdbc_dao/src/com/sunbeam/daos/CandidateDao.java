package com.sunbeam.daos;

import java.util.List;

import com.sunbeam.pojos.Candidate;

public interface CandidateDao extends AutoCloseable {
	List<Candidate> findAll() throws Exception;
	List<Candidate> findByParty(String party) throws Exception;
	Candidate findById(int id) throws Exception;
	int save(Candidate c) throws Exception; 
}
