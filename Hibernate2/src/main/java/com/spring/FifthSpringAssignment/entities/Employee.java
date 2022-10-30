package com.spring.FifthSpringAssignment.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*** Created an Employee entity and setup its table name ***/
@Entity
@Table(name = "employeeTable")
public class Employee {
    @Id
    @Column(name = "empId")
    private Integer id;

    @Column(name = "empAge")
    private Integer age;

    @Column(name="empSalary")
    private Integer salary;

    @Column(name="empFirstName")
    private String firstName;

    @Column(name = "empLastName")
    private String lastName;

    /*** Empty Constructor **/
    public Employee(){

    }

    /*** Parameterized Constructor **/
    public Employee(Integer id, Integer age, Integer salary, String firstName, String lastName) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*** Getters and Setters ***/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
