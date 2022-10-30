package com.spring.FourthSpringAssignment.repositories;

import com.spring.FourthSpringAssignment.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/** Solution 2 : Created EmployeeRepository here **/
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    /** Defined a method which finds Employee by name ***/
    public Employee findByName(String name);

    /*** Defined a method which finds employee whose name starts with chr **/
    public Employee findByNameStartsWith(Character chr);

    /*** Defined a method which gets list of employees whose age is between the range passed in the method **/
    List<Employee> findByAgeBetween(Integer startAge, Integer endAge);
}
