package com.spring.ThirdSpringAssignment.Hateoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.EntityModel;

import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class UserControllerHateoas {
    @Autowired
    private UserServiceHateoas userService;

    /** A mapping to get all the users of the list **/
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userService.getAllUsers();
    }

    /** A mapping to get the user whose id is passed and a uri which returns the list of all users **/
    @GetMapping("/hateusers/{id}")
    public EntityModel<User> getUser(@PathVariable int id){
        /**Getting the user from the list by passing id as parameter **/
        Optional<User> user = userService.getUser(id);

        /** A simple EntityModel wrapping an object of User class **/
        EntityModel<User> resource = EntityModel.of(user.get());

        /** Created a link to retrieve all users from the list **/
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllUsers());

        /** Combined the resource object of EntityModel and link that was created above, and named the link to "all-users" **/
        resource.add(linkTo.withRel("all-users"));

        return resource;
    }
}
