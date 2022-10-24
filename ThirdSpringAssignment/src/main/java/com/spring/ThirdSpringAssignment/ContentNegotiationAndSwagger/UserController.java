package com.spring.ThirdSpringAssignment.ContentNegotiationAndSwagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    UserService userService = new UserService();

    /***@ApiOperation is used to give description for the URIs in the swagger documentation **/

    /** Mapping to get user details in the XML format and save it in the list **/
    /*** consumes = MediaType.APPLICATION_XML_VALUE helps to get user details in XML format **/

    @ApiOperation(value="Save User Information", notes = "Saves user information in the list with help of @RequestBody")
    @PostMapping(path = "/api/save-user-info", consumes = MediaType.APPLICATION_XML_VALUE)
    public String UserInformation(@RequestBody User user){
        return userService.saveUser(user);
    }

    /*** Mapping to retrieve all the users in the list in the XML format **/
    /*** produces = MediaType.APPLICATION_XML_VALUE helps to return user details in XML format **/

    @ApiOperation(value="Retrieve all users", notes = "Retrieves all users stored in the list")
    @GetMapping(path="/api/getUsers", produces = MediaType.APPLICATION_XML_VALUE)
    public List<User> getUsers(){
        return userService.getUsers();
    }

    /*** A mapping to delete a user from the list **/
    @ApiOperation(value="Delete user", notes = "Deletes a user from the list whose id is passed in url")
    @DeleteMapping(path="/api/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        if(userService.deleteUser(id)==true) {
            return "User with id :" + id + " got deleted";
        }else{
            return "User wasn't deleted";
        }
    }

}
