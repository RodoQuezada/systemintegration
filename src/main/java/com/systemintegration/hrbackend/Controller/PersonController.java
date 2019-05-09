package com.systemintegration.hrbackend.Controller;

import com.systemintegration.hrbackend.entity.models.Person;
import com.systemintegration.hrbackend.entity.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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


}
