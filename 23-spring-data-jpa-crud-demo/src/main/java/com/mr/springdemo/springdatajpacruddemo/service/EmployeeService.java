package com.mr.springdemo.springdatajpacruddemo.service;

import com.mr.springdemo.springdatajpacruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);

}
