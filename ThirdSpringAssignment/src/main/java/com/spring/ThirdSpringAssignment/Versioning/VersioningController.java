package com.spring.ThirdSpringAssignment.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {

    /** Created objects of UserV1 and UserV2 class **/
    String userV1 = new UserV1(1,20,"Mohit Ramtari").toString();
    String userV2 = new UserV2(1,20,2000,"Mohit Ramtari","Software Engineer","Gwalior").toString();


    /*** Versioning through URI ***/
    @RequestMapping(path = "/user/v1")
    public String getUserDetails(){
        return userV1;
    }

    @RequestMapping(path = "/user/v2")
    public String getEnhancedUserDetails(){
        return userV2;
    }


    /*** Versioning through parameters ***/
    /** If parameter "version=1" is passed in the uri, then this mapping will be called **/
    @GetMapping(value = "/user/param",params = "version=1")
    public String getUserDetailsParam(){
        return userV1;
    }

    /** If parameter "version=2" is passed in the uri, then this mapping will be called **/
    @GetMapping(value = "/user/param",params = "version=2")
    public String getEnhancedUserDetailsParam(){
        return userV2;
    }


    /*** Versioning through Headers ***/
    /** If header "X_API_VERSION" value is set to 1 in the api calling, then this mapping is called **/
    @GetMapping(value = "/user/header",headers = "X-API-VERSION=1")
    public String getUserDetailsHeader(){
        return userV1;
    }

    /** If header's value is set to 2, then this mapping is called **/
    @GetMapping(value = "/user/header", headers = "X-API-VERSION=2")
    public String getEnhancedUserDetailsHeader(){
        return userV2;
    }

    /*** Versioning through Media Type ***/
    /** If "Accept" value is passed "application/vnd.company.app-v1+json", then this mapping is called **/
    @GetMapping(value = "/user/produces", produces = "application/vnd.company.app-v1+json" )
    public String getUserDetailsMedia(){
        return userV1;
    }

    /** If "Accept" value is passed "application/vnd.company.app-v2+json", then this mapping is called **/
    @GetMapping(value = "/user/produces", produces = "application/vnd.company.app-v2+json")
    public String getEnhancedUserDetailsMedia(){
        return userV2;
    }
}
