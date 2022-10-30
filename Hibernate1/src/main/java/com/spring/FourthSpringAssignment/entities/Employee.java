package com.spring.FourthSpringAssignment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

/*** Solution 1 : Created an Employee entity with the fields of Name, Age, Id and Location ***/
@Entity
public class Employee {
    @Id
    private Integer id;

    private String name, location;

    private Integer age;

    /** Created Empty and Parameterized Constructors here ***/
    public Employee(){

    }

    public Employee(int id, String name, String location, int age) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.age = age;
    }

    /** Getters and Setters of all the fields **/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
