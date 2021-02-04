package com.springboot.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.app.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}