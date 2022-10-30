package com.spring.FourthSpringAssignment;

import com.spring.FourthSpringAssignment.entities.Employee;
import com.spring.FourthSpringAssignment.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class FourthSpringAssignmentApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void testCreate(){
//		Employee employee = new Employee();
//		employee.setId(1);
//		employee.setAge(20);
//		employee.setLocation("Gwalior");
//		employee.setName("Mohit");
//
//		employeeRepository.save(employee);
//	}
//
//	@Test
//	public void testRead(){
//		Employee emp = employeeRepository.findById(1).get();
//
//	}
}
