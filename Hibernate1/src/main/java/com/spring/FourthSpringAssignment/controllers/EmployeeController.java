package com.spring.FourthSpringAssignment.controllers;

import com.spring.FourthSpringAssignment.services.EmployeeService;
import com.spring.FourthSpringAssignment.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    /*** Defined a Mapping to get all the employees in the list**/
    @GetMapping("/allEmployees")
    private List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    /*** Defined a Mapping to get the employee by the id ***/
    @GetMapping("/employees/{id}")
    private Optional<Employee> getEmployee(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    /*** Defined a mapping to create or update an employee***/
    @PostMapping("/employees")
    private void createEmployee(@RequestBody Employee employee){
         employeeService.createOrUpdateEmployee(employee);
    }

    /*** Defined a Mapping to delete an employee from the list, whose id is passed in url ***/
    @DeleteMapping("/deleteEmployee/{id}")
    private void deleteEmployee(@PathVariable Integer id){
        employeeService.deleteEmployee(id);
    }

    /*** Defined a Mapping to get the count of employees in the list ***/
    @GetMapping("/countEmployees")
    private String countEmployees(){
        return "Total number of employees are : "+employeeService.countEmployees();
    }

    /*** Defined a Mapping to retrieve an employee by its name ***/
    @GetMapping("/employee/{name}")
    private Employee getEmployeeByName(@PathVariable String name){
        return employeeService.getEmployeeByName(name);
    }

    /*** Defined a mapping to get the employee name whose name starts with the character passed in the url ***/
    @GetMapping("/empchar/{chr}")
    private Employee getEmployeeNameByChar(@PathVariable Character chr){
        return employeeService.getEmployeeNameByCharacter(chr);
    }

    /*** Defined a mapping to get list of employee by the age ***/
    @GetMapping("/employeesbyage")
    private List<Employee> getEmployeesByAgeBetween(){
        return employeeService.getEmployeesByAgeBetween(28,32);
    }

    /** Defined a Mapping to show usage of pagination ***/
    @GetMapping("/pagination")
    private Page<Employee> getEmployeePaginated(){
        return employeeService.getEmployeesPaginated();
    }
}
