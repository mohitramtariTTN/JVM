package com.spring.FifthSpringAssignment.repositories;

import com.spring.FifthSpringAssignment.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    /*** Solution 1 : Employees who have greater than average salary ***/
    @Query(value = "SELECT firstName, lastName FROM Employee e where salary>ALL(SELECT avg(salary) FROM Employee) ORDER BY age, salary DESC")
    List<Object> findAllUsers();

    /*** Solution 2 : update salary query, in this query I am updating employees whose salary is less than average salary **/
    /*** And to find average salary, i am calling getAverageSalary() which is defined just below this method **/
    @Transactional
    @Modifying
    @Query(value = "UPDATE Employee set salary = :value where salary < :averageSalary")
    void updateSalary(@Param("value") Integer value, @Param("averageSalary") Integer averageSalary);

    @Query(value = "SELECT avg(empSalary) from employeeTable", nativeQuery = true)
    Integer getAverageSalary();


    /*** Solution 3 : Delete employees query, in this query I am deleting employees whose salary is minimum **/
    /*** And to find minimum salary, i am calling getMinimumSalary() which is defined just below this method **/

    @Transactional
    @Modifying
    @Query(value = "DELETE from Employee e WHERE salary = :min")
    void deleteMinimum(@Param("min") Integer min);

    @Query(value = "SELECT min(empSalary) from employeeTable", nativeQuery = true)
    Integer getMinimumSalary();

    /*** Solution 4 : Created a Query to get Employees whose name ends with Singh ***/
    @Query(value = "SELECT empId, empFirstName, empLastName from employeeTable where empLastName like '%singh'", nativeQuery = true)
    List<Object> lastNameEndsWithSingh();


    /*** Solution 5 : Created a query which deletes employee whose age is greater than the value passed in the parameter ***/
    @Transactional
    @Modifying
    @Query(value = "DELETE from employeeTable where empAge >= :value", nativeQuery = true)
    void deleteGreaterThan(@Param("value") Integer value);

}
