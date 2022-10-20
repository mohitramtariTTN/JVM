package com.spring.Assignment2;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*** Created an Employee class here to make objects for the employee ***/
public class Employee {
    /*** Here, I have provided @NotNull so that values of these instances aren't left Null ***/
    @NotNull
    private int id;
    @NotNull
    private int age;

    /***Here, I am giving size to this instance also i.e. minimum size must be 3 and maximum must be 20 **/
    @NotNull
    @Size(min = 3, max = 20)
    private String name;

    /** Just an Empty Constructor ***/
    public Employee(){

    }

    /** A parameterized constructor to initialize object ***/
    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    /*** Getters and Setters functions for all the instances ***/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*** Override the toString() method ***/
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
