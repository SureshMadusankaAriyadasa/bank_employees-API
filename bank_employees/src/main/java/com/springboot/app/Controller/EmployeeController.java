package com.springboot.app.Controller;

import java.util.List;
import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.Model.Branch;
import com.springboot.app.Model.Employee;
import com.springboot.app.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

    @GetMapping("/all_emp")
    public List<Employee> list() {
        return employeeService.listAllUser();
    }
    
   
    @GetMapping("/search/{emp_id}")
    public ResponseEntity<Employee> employee(@PathVariable int emp_id) {
        try {
        	Employee employee = employeeService.get(emp_id);
            return new ResponseEntity<Employee>(employee, HttpStatus.OK);
        } catch (NoSuchElementException ee) {
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }      
    }
}
