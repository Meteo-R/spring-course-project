package com.mr.springdemo.jpacruddemo.service;

import com.mr.springdemo.jpacruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);

}
