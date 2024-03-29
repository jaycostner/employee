package com.management.employee.repository;


import com.management.employee.dbo.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}
