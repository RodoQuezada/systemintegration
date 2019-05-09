package com.systemintegration.hrbackend.entity.repository;

import com.systemintegration.hrbackend.entity.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonRepository extends CrudRepository<Person, Long > {
}
