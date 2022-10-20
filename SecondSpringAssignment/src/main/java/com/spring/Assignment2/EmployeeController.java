package com.spring.Assignment2;

import com.spring.Assignment2.ExceptionHandling.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

/*** Creating a Controller here **/
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    /*** Mapping to return a Welcome Message **/
    @RequestMapping(method= RequestMethod.GET, path = "/")
    public String simpleRestfulService(){
        return "Welcome to Spring Boot";
    }

    /** Mapping to return all employees in the list ***/
    @GetMapping("/allEmployees")
    public List getEmployees(){
        return employeeService.retrieveAll();
    }

    /*** Mapping to return employee by ID else throw Exception **/
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        Employee emp = (employeeService.retrieveEmployeeById(id));
        if(emp == null)
            throw new EmployeeNotFoundException("employee Not found ");
        return emp;
    }

    /** Mapping to create an employee in the list ***/
    @PostMapping("/create")
    public String createUser(@Valid @RequestBody Employee employee){
        if(employeeService.add(employee) == true)
            return "Employee created successfully";
        else
            return "Employee wasn't created";
    }

    /*** Mapping to delete an employee by ID ***/
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id){
        employeeService.delete(id);
    }

    /*** Mapping to update details of an employee **/
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.update(employee);
    }
}
