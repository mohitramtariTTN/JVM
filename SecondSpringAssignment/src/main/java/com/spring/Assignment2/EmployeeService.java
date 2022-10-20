package com.spring.Assignment2;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    /*** Created a list here to store employee objects ***/
    static List<Employee> employees = new ArrayList<Employee>();
    static{
        /** Adding the employees to the list ***/
        employees.add(new Employee(1,20,"Mohit Ramtari"));
        employees.add(new Employee(2,25,"Ayush Jain"));
        employees.add(new Employee(3,23,"Vaibhav Kamal"));
        employees.add(new Employee(4,50,"Bhuva Raj"));
    }

    /** Method to return all the employees in the list **/
    public List retrieveAll(){
        return employees;
    }

    /** Method to return employee by the Id else return Null***/
    public Employee retrieveEmployeeById(int id){
        for(Employee e : employees){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    /** Method to add an employee to the list **/
    public boolean add(Employee employee){
        return employees.add(employee);
    }

    /*** Method to delete an employee by the id ***/
    public boolean delete(int id){
        return employees.removeIf(employee -> employee.getId()==id);
    }

    /*** Method to update the details of the employee **/
    public Employee update(Employee employee){
        for(Employee e : employees){
            if(e.getId() == employee.getId()){
                e.setAge(employee.getAge());
                e.setName(employee.getName());
            }
        }
        return employee;
    }
}
