package com.spring.FifthSpringAssignment.services;

import com.spring.FifthSpringAssignment.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    /** Method for Solution 1 ***/
    public List<Object> greaterThanAverageSalary(){
        return employeeRepository.findAllUsers();
    }

    /*** Method for Solution 2 **/
    public void updateSalary(Integer salary){
        Integer averageSalary = employeeRepository.getAverageSalary();
        employeeRepository.updateSalary(salary,averageSalary);
    }

    /*** Method for Solution 3 ***/
    public void deleteMinimum(){
        Integer min = employeeRepository.getMinimumSalary();
        employeeRepository.deleteMinimum(min);
    }

    /*** Method for Solution 4 ***/
    public List<Object> lastNameEndsWithSingh(){
        return employeeRepository.lastNameEndsWithSingh();
    }

    /** Method for Solution 5 ***/
    public void deleteGreaterThan(Integer value){
        employeeRepository.deleteGreaterThan(value);
    }
}
