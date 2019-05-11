package com.systemintegration.hrbackend.Controller;

import com.systemintegration.hrbackend.entity.models.Person;
import com.systemintegration.hrbackend.entity.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getAll(){
        return personService.getAll();
    }

    @GetMapping("/load")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> loadEntity(){
        Person person = new Person();
        person.setName("Alejandra");
        person.setLastName("Ojeda");
        person.setEmail("ale@gmail.com");
        person.setPhoneNumber(123123);
        personService.save(person);
        return personService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person save(@RequestBody @Valid Person person){
        return personService.save(person);
    }


}
