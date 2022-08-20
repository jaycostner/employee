package com.management.employee.service;


import com.management.employee.dbo.Employee;
import com.management.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findAllEmployees(){
        return(List<Employee>)employeeRepo.findAll();
    }

    public Employee findEmployeeById(Long employeeId){
        Optional<Employee> optionalEmployee = employeeRepo.findById(employeeId);
        if (optionalEmployee.isPresent()){
            return optionalEmployee.get();
        }
        return new Employee();
    }

    public Employee createNewEmployee( Employee employee){
       if(!employeeRepo.existsById(employee.getEmpId())){
            employeeRepo.save(employee);
      }
        return employee;
    }

    public Employee updateCurrentEmployee(Long employeeId, Employee employee){
        if (employeeRepo.existsById(employeeId)){
            employeeRepo.save(employee);
        }
        return employee;
    }

    public void deleteAllEmployees(){
        employeeRepo.deleteAll();
    }
}
