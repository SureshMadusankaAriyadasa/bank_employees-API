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


import com.springboot.app.Model.Bank;
import com.springboot.app.Service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {
	@Autowired
    BankService bankService;

    @GetMapping("/all")
    public List<Bank> list() {
        return bankService.listAllUser();
    }
    
   
    @GetMapping("/search/{bank_id}")
    public ResponseEntity<Bank> get(@PathVariable int bank_id) {
        try {
        	Bank bank = bankService.get(bank_id);
            return new ResponseEntity<Bank>(bank, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Bank>(HttpStatus.NOT_FOUND);
        }      
    }

}
