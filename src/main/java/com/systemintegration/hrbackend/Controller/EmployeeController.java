package com.systemintegration.hrbackend.Controller;

import com.systemintegration.hrbackend.entity.models.Employee;
import com.systemintegration.hrbackend.entity.models.Job;
import com.systemintegration.hrbackend.entity.services.IEmployeeService;
import com.systemintegration.hrbackend.entity.services.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IJobService jobService;


    @GetMapping("/load")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> loadData(){

        Job developer = new Job();
        developer.setId(1l);
        developer.setTitle("Developer");
        developer.setMaxSalary(1200);
        developer.setMinSalary(900);

        jobService.save(developer);

        Employee Rodolfo = new Employee();
      //  Rodolfo.setId(1l);
        Rodolfo.setName("Rodolfo");
        Rodolfo.setLastName("Quezada");
        Rodolfo.setRut("16147138-0");
        Rodolfo.setEmail("rodolfo.quezada.s@gmail.com");
        Rodolfo.setPhoneNumber(9999);
        Rodolfo.setHireDate(new Date());
        Rodolfo.setJob(developer);

        employeeService.save(Rodolfo);
        return employeeService.findAll();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAll(){
        return employeeService.findAll();
    }




}
