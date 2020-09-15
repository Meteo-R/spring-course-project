package com.mr.springdemo.cruddemo.rest;

import com.mr.springdemo.cruddemo.dao.EmployeeDao;
import com.mr.springdemo.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeRestController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

}
