package com.management.employee.dbo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    @Id
    private Long empId;
    private String firstName;
    private String lastName;
    private int age;
}
