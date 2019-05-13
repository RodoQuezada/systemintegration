package com.systemintegration.hrbackend.entity.repository;

import com.systemintegration.hrbackend.entity.models.Employee;
import com.systemintegration.hrbackend.entity.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobRepository extends JpaRepository<Job, Long> {

}