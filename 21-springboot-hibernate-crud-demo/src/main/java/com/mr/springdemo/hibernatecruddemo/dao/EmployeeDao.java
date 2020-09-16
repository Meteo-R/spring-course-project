package com.mr.springdemo.hibernatecruddemo.dao;

import com.mr.springdemo.hibernatecruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

    Employee findById(int id);

    void save(Employee employee);

    void deleteById(int id);

}
