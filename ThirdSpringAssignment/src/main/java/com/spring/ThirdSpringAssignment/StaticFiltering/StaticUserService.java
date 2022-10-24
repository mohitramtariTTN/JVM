package com.spring.ThirdSpringAssignment.StaticFiltering;

import java.util.ArrayList;
import java.util.List;

public class StaticUserService {
    /** Created a List, to store user objects **/
    static List<User> users = new ArrayList<User>();

    /** Populated the list **/
    static{
        users.add(new User(1,20,"Mohit Ramtari","password"));
        users.add(new User(2,21,"Ayush Jain","123456"));
    }

    /** Created a saveUser() method, to save the user in the list **/
    public User saveUser(User user){
        if(users.add(user)==true)
            return user;
        else
            return null;
    }

    /** This method will return the entire list of the User **/
    public List<User> returnAllUsers(){
        return users;
    }
}
