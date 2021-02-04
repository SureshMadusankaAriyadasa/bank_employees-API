package com.springboot.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.app.Model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {
}