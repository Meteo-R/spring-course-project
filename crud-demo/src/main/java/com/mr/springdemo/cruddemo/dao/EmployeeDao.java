package com.mr.springdemo.cruddemo.dao;

import com.mr.springdemo.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

}
