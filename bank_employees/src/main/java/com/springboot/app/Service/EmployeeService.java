package com.springboot.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.Model.Employee;
import com.springboot.app.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> listAllUser() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public Employee get(int emp_id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(emp_id).get();
	}

	public Optional<Employee> findById(int emp_id) {
		// TODO Auto-generated method stub
		return null;
	}
}