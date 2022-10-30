package com.spring.FifthSpringAssignment.controllers;

import com.spring.FifthSpringAssignment.repositories.EmployeeRepository;
import com.spring.FifthSpringAssignment.services.EmployeeService;
import com.spring.FifthSpringAssignment.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeService employeeService;

    /*** A Post mapping to create employees **/
    @PostMapping("/create")
    public void createEmployee(){
        Employee emp = new Employee(7,20,15000,"Rahul","Singh");
        Employee emp2 = new Employee(8,25,2000,"Rohit","Sharma");
        Employee emp3 = new Employee(9,22,11000,"Mohit","Ramtari");
        Employee emp4 = new Employee(10,21,9000,"Dinesh","Karthik");

        employeeRepository.save(emp);
        employeeRepository.save(emp2);
        employeeRepository.save(emp3);
        employeeRepository.save(emp4);
    }

    /** Solution 1 : Created a mapping which lists Employees who have more salary than the average salary ***/
    @GetMapping("/greater_than_average")
    public List<Object> greaterThanAverageSalary(){
        return employeeService.greaterThanAverageSalary();
    }

    /*** Solution 2 : Created a mapping which updates the salary by the parameter passed in url ***/
    @PutMapping("/update/{salary}")
    public void updateSalary(@PathVariable Integer salary){
        employeeService.updateSalary(salary);
    }

    /*** Solution 3 : Created a mapping which deletes the employee who has minimum salary ***/
    @DeleteMapping("/deleteMinimum")
    public void deleteMinimum(){
        employeeService.deleteMinimum();
    }

    /** Solution 4 : Creates a mapping which returns list of employees whose name ends with singh ***/
    @GetMapping("/ends_with_singh")
    public List<Object> lastNameEndsWithSingh(){
        return employeeService.lastNameEndsWithSingh();
    }

    /*** Solution 5 : Creates a mapping which deletes Employee whose age is greater than value passed in url***/
    @DeleteMapping("/delete_greater_than/{value}")
    public void deleteGreaterThan(@PathVariable Integer value){
        employeeService.deleteGreaterThan(value);
    }

}
