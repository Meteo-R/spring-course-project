package com.mr.springdemo.springdatajpacruddemo.dao;

import com.mr.springdemo.springdatajpacruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);

}
