package com.systemintegration.hrbackend.entity.services.impl;

import com.systemintegration.hrbackend.entity.models.Job;
import com.systemintegration.hrbackend.entity.repository.IJobRepository;
import com.systemintegration.hrbackend.entity.services.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements IJobService {

    @Autowired
    private IJobRepository jobRepository;


    @Override
    public Job save(Job job) {
        return jobRepository.save(job);
    }
}
