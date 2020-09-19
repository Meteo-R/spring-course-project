package com.mr.springdemo.springdatajpacruddemo.dao;

import com.mr.springdemo.springdatajpacruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
