package com.spring.FourthSpringAssignment.services;

import com.spring.FourthSpringAssignment.entities.Employee;
import com.spring.FourthSpringAssignment.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    /*** Created a method which returns list of all employees in the database ***/
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(emp->employees.add(emp));
        return employees;
    }

    /*** Created a method which returns Employee by the id passed in the method **/
    public Optional<Employee> getEmployeeById(int id){
        return employeeRepository.findById(id);
    }

    /*** Created a method which either deletes or update the employee in the database ***/
    public void createOrUpdateEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    /*** Created a method to delete the employee by the id passed in the method **/
    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }

    /*** Created a method to return the count of employees in the database ***/
    public long countEmployees(){
        return employeeRepository.count();
    }

    /*** Created a method to return Employee found through name passed in the method ***/
    public Employee getEmployeeByName(String name){
        return employeeRepository.findByName(name);
    }

    /*** Created a method which finds employee by the character passed in the method ***/
    public Employee getEmployeeNameByCharacter(Character chr){
        return employeeRepository.findByNameStartsWith(chr);
    }

    /*** Created a method which returns list of employees ranging between the age passed in the method **/
    public List<Employee> getEmployeesByAgeBetween(Integer start, Integer end){
        return employeeRepository.findByAgeBetween(start,end);
    }

    /*** Created a method which returns Employee by pagination ***/
    /** Here I am returning two employees of the first page ***/
    public Page<Employee> getEmployeesPaginated(){
        Pageable firstPageWithTwoEmployees = PageRequest.of(0,2, Sort.by("age"));
        return employeeRepository.findAll(firstPageWithTwoEmployees);
    }
}
