package com.spring.Assignment2;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Salary{
    int id, salary;
    Salary(int id, int salary){
        this.id = id ;
        this.salary = salary;
    }
}
@Service
public class EmployeeService {
    /*** Created a list here to store employee objects ***/
    static List<Employee> employees = new ArrayList<Employee>();
    static List<Salary>Salaries = new ArrayList<Salary>();

    static{
        /** Adding the employees to the list ***/
        employees.add(new Employee(1,20,"Mohit Ramtari"));
        employees.add(new Employee(2,25,"Ayush Jain"));
        employees.add(new Employee(3,23,"Vaibhav Kamal"));
        employees.add(new Employee(4,50,"Bhuva Raj"));

        Salaries.add(new Salary(1,20000));
        Salaries.add(new Salary(2,22000));
        Salaries.add(new Salary(3,12000));
        Salaries.add(new Salary(4,23000));
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

    public List retrieveSalary(int id){

        Optional<Salary> salary = Salaries.stream().filter(Salaries -> Salaries.id == id).findFirst();
        Optional<Employee> emp = employees.stream().filter(employee -> employee.getId() == id).findFirst();
        
    }
}
