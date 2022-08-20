package com.management.employee.controller;


import com.management.employee.dbo.Employee;
import com.management.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //find all employees
    @RequestMapping(value="/employees", method= RequestMethod.GET)
    public List<Employee>findAllEmployees(){
        return employeeService.findAllEmployees();
    }
    //find employee by id
    @RequestMapping(value="/employees/{employeeId}",method= RequestMethod.GET)
    public Employee findEmployeeById(@PathVariable Long employeeId){
    return employeeService.findEmployeeById(employeeId);
    }
    //create employee
    @RequestMapping(value="/employees", method = RequestMethod.POST)
    public Employee createNewEmployee(@RequestBody Employee employee){
        return employeeService.createNewEmployee( employee);
    }
    //update employee
    @RequestMapping(value="/employees/{employeeId}",method = RequestMethod.PUT)
    public Employee updateCurrentEmployee(@PathVariable Long employeeId, @RequestBody Employee employee){
        return employeeService.updateCurrentEmployee(employeeId, employee);
    }
    //delete all employees
    @RequestMapping(value="/employees", method = RequestMethod.DELETE)
    public void deleteAllEmployees(){
        employeeService.deleteAllEmployees();
    }
}
