package com.systemintegration.hrbackend.entity.services.impl;

import com.systemintegration.hrbackend.entity.models.Person;
import com.systemintegration.hrbackend.entity.repository.IPersonRepository;
import com.systemintegration.hrbackend.entity.services.IPersonService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collector;

@Service
public class PersonServiceImpl implements IPersonService {

    private final IPersonRepository personRepository;

    public PersonServiceImpl(IPersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Person> getAll() {
        List<Person> personList = new ArrayList<>();
        personRepository.findAll().forEach(personList::add);
        return personList;
    }

    @Override
    public Person save(Person person) {
        personRepository.save(person);
        return person;
    }
}
