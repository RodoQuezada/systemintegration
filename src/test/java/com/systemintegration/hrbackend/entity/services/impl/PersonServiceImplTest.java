package com.systemintegration.hrbackend.entity.services.impl;

import com.systemintegration.hrbackend.entity.models.Person;
import com.systemintegration.hrbackend.entity.repository.IPersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class PersonServiceImplTest {

    @Mock
    IPersonRepository personRepository;

    PersonServiceImpl personService;

    public static final long ID_CLIENTE = 1l;
    public static final String NAME= "Rodolfo";
    public static final String LASTNAME ="Quezada";
    public static final String EMAIL = "rodolfo.quezada.s@gmail.com";
    public static final int PHONENUMBER= 123123;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        personService = new PersonServiceImpl(personRepository);
    }


    @Test
    public void getAll() throws Exception {
        Person person_one = new Person();
        Person person_two = new Person();

        when(personRepository.findAll()).thenReturn(Arrays.asList(person_one,person_two));
        List<Person> personList = personService.getAll();
        assertEquals(2 , personList.size());
    }
}