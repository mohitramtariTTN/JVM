package com.spring.FifthSpringAssignment;

import com.spring.FifthSpringAssignment.ComponentMapping.EmployeeeRepository;
import com.spring.FifthSpringAssignment.ComponentMapping.EmployeeSalary;
import com.spring.FifthSpringAssignment.ComponentMapping.Employeee;
import com.spring.FifthSpringAssignment.JoinedStrategy.*;
import com.spring.FifthSpringAssignment.SingleTableStrategy.FourWheeler;
import com.spring.FifthSpringAssignment.SingleTableStrategy.TwoWheeler;
import com.spring.FifthSpringAssignment.SingleTableStrategy.VehicleRepository;
import com.spring.FifthSpringAssignment.TablePerClass.FullTimeEmployee;
import com.spring.FifthSpringAssignment.TablePerClass.FullTimeEmployeeRepository;
import com.spring.FifthSpringAssignment.TablePerClass.PartTimeEmployee;
import com.spring.FifthSpringAssignment.TablePerClass.PartTimeEmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FifthSpringAssignmentApplicationTests {
	@Autowired
	VehicleRepository vehicleRepository;

	@Autowired
	FullTimeEmployeeRepository fullTimeEmployeeRepository;

	@Autowired
	PartTimeEmployeeRepository partTimeEmployeeRepository;

	@Autowired
	SquareRepository squareRepository;

	@Autowired
	RectangleRepository rectangleRepository;

	@Autowired
	EmployeeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	@Test
	void testCreateVehicle(){
		TwoWheeler tw = new TwoWheeler();
		tw.setVehicleId(1);
		tw.setVehicleName("Passion");
		tw.setSteeringTwoWheeler("Passion Steering Type");
		vehicleRepository.save(tw);

		FourWheeler fw = new FourWheeler();
		fw.setVehicleId(2);
		fw.setVehicleName("Nano");
		fw.setSteeringFourWheeler("Nano Steering Type");
		vehicleRepository.save(fw);
	}

	@Test
	void testCreateEmployee(){
		PartTimeEmployee pte = new PartTimeEmployee();
		pte.setEmployeeId(1);
		pte.setEmployeeName("Vaibhav Kamal");
		pte.setPerHourRate(20000000);
		partTimeEmployeeRepository.save(pte);

		FullTimeEmployee fte = new FullTimeEmployee();
		fte.setEmployeeId(2);
		fte.setEmployeeName("Mohit Ramtari");
		fte.setSalary(1000000);
		fullTimeEmployeeRepository.save(fte);
	}

	@Test
	void testCreateShape(){
		Square sq = new Square();
		sq.setId(1);
		sq.setSide(4.2);
		sq.setShapeType("Square");
		squareRepository.save(sq);

		Rectangle rect = new Rectangle();
		rect.setId(2);
		rect.setLength(5.3);
		rect.setBreadth(3.4);
		rect.setShapeType("Rectangle");
		rectangleRepository.save(rect);
	}

	@Test
	void testCreateEmployeeInComponentMapping(){
		Employeee emp = new Employeee();
		emp.setAge(20);
		emp.setFirstName("Mohit");
		emp.setLastName("Ramtari");

		EmployeeSalary empSalary = new EmployeeSalary();
		empSalary.setBasicSalary(30000);
		empSalary.setBonusSalary(5000);
		empSalary.setTaxAmount(0);
		empSalary.setSpecialAllowanceSalary(10000);

		emp.setEmployeeSalary(empSalary);
		
		employeeRepository.save(emp);
	}
}
