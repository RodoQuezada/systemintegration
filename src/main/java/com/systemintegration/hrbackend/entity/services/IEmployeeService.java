package com.systemintegration.hrbackend.entity.services;

import com.systemintegration.hrbackend.entity.models.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findAll();

    Employee save (Employee employee);


}
