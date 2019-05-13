package com.systemintegration.hrbackend.entity.repository;

import com.systemintegration.hrbackend.entity.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
