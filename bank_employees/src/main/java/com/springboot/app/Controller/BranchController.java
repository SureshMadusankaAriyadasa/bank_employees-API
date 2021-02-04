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
import com.springboot.app.Service.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {

		@Autowired
		BranchService branchService;

	    @GetMapping("/all_branches")
	    public List<Branch> list() {
	        return branchService.listAllUser();
	    }
	    
	   
	    @GetMapping("/search/{branch_id}")
	    public ResponseEntity<Branch> branch(@PathVariable int branch_id) {
	        try {
	        	Branch branch = branchService.get(branch_id);
	            return new ResponseEntity<Branch>(branch, HttpStatus.OK);
	        } catch (NoSuchElementException ee) {
	            return new ResponseEntity<Branch>(HttpStatus.NOT_FOUND);
	        }      
	    }
}
