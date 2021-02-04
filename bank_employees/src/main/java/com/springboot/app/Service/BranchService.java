package com.springboot.app.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.Model.Branch;
import com.springboot.app.Repository.BranchRepository;

@Service
public class BranchService {

	@Autowired
	private BranchRepository branchRepository;
	
	public List<Branch> listAllUser() {
		// TODO Auto-generated method stub
		return branchRepository.findAll();
	}

	public Branch get(int branch_id) {
		// TODO Auto-generated method stub
		return branchRepository.findById(branch_id).get();
	}

	public Optional<Branch> findById(int branch_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
