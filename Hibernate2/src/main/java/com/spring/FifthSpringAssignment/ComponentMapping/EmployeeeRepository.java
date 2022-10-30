package com.spring.FifthSpringAssignment.ComponentMapping;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeeRepository extends CrudRepository<Employeee, Integer> {
}
