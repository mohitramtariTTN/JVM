package com.spring.ThirdSpringAssignment.DynamicFiltering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DynamicFilteringController {

    @RequestMapping("/dynamicFiltering")
    public MappingJacksonValue dynamicFiltering(){

        /**SimpleBeanPropertyFilter is an interface which provides support for Dynamic Filtering **/
        /** Its filterOutAllExcept() method is used which filter all the properties of the class except of those listed in the method **/
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","name","salary");

        /** Here "dynamicFilter" is used, it is the same id that I gave to the class DynamicUser **/
        FilterProvider filters = new SimpleFilterProvider().addFilter("dynamicFilter",filter);

        /*** Created an object of DynamicUser **/
        DynamicUser dynamicUser = new DynamicUser(1,20000,"Mohit Ramtari","password");

        /** Created an object of MappingJacksonValue, and passed dynamicUser object in its constructor **/
        MappingJacksonValue mapping = new MappingJacksonValue(dynamicUser);

        /** And then passed the filters in its setFilters method, which sets the filters for the object **/
        mapping.setFilters(filters);

        return mapping;
    }
}
