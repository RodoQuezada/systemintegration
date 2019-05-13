package com.systemintegration.hrbackend.entity.services.impl;

import com.systemintegration.hrbackend.entity.models.Employee;
import com.systemintegration.hrbackend.entity.repository.IEmployeeRepository;
import com.systemintegration.hrbackend.entity.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
