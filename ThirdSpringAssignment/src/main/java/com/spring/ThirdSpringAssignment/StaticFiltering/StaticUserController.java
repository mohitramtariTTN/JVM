package com.spring.ThirdSpringAssignment.StaticFiltering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaticUserController {
    StaticUserService userService = new StaticUserService();

    /** Ask about this doubt to sir **/
//    @RequestMapping("/staticFiltering")
//    public User saveUser(@RequestBody User user){
//        return userService.saveUser(user);
//    }

    /** Both the mappings below, will return all the properties except password**/
    /** Because I have used @JsonIgnore on it **/

    /** Mapping to save the user in the list **/
    @RequestMapping("/staticFiltering")
    public User saveUser(){
        return new User(1,20,"Mohit","password");
    }

    /** Mapping to return all users from the list **/
    @GetMapping("/staticReturnAllUsers")
    public List<User> returnAllUsers(){
        return userService.returnAllUsers();
    }
}
