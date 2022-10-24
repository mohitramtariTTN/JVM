package com.spring.ThirdSpringAssignment.StaticFiltering;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** Created a normal User class, which has some properties, getters and setters and constructor **/
public class User {
    private int id, age;
    private String name;

    /**@JsonIgnore is used to provide Static Filtering, when get request api is called, password's value won't be return **/
    @JsonIgnore
    private String password;

    public User(int id, int age, String name, String password){
        this.id = id;
        this.age = age;
        this.name = name;
        this.password = password;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
