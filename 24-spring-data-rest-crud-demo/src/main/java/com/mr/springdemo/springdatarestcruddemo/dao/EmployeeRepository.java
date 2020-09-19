package com.mr.springdemo.springdatarestcruddemo.dao;

import com.mr.springdemo.springdatarestcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
