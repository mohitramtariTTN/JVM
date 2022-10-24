package com.spring.ThirdSpringAssignment.Hateoas;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserServiceHateoas {
    /** Created a list of user **/
    static List<User> users = new ArrayList<User>();

    /** Populated the list **/
    static{
        users.add(new User(1,20,"Mohit"));
        users.add(new User(2,22,"Vaibhav"));
    }

    /** Method to get the entire list of users **/
    public List<User> getAllUsers(){
        return users;
    }

    /** Method to get the user whose id is passed **/
    public Optional<User> getUser(int id){
        return users.stream().filter(u->u.getId()==id).findFirst();
    }
}
