package com.spring.ThirdSpringAssignment.ContentNegotiationAndSwagger;

import io.swagger.annotations.ApiModel;

/*** Here I have created User class which has some basic properties and getters and setters and a constructor **/

/**@ApiModel is used to provide description for the class in Swagger documentation **/

@ApiModel(description = "It is the User class, its objects would be stored in the list and multiple methods will be applied on it")
public class User {
    private int id;
    private String name;
    private int age;

    public User(){

    }
    public User(int id,String name, int age){
        this.id = id;
        this.age = age;
        this.name = name;
    }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "User name is "+this.name+" his age is "+this.age+" and his id is "+this.id;
    }
}
