package com.springboot.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import com.springboot.app.Model.Bank;
import com.springboot.app.Repository.BankRepository;

@Service
public class BankService {
	@Autowired
	private BankRepository bankRepository;
	
	public List<Bank> listAllUser() {
		// TODO Auto-generated method stub
		return bankRepository.findAll();
	}

	public Bank get(int bank_id) {
		// TODO Auto-generated method stub
		return bankRepository.findById(bank_id).get();
	}

	public Optional<Bank> findById(int bank_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
