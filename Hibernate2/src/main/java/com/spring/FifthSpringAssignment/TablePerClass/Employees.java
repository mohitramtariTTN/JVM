package com.spring.FifthSpringAssignment.TablePerClass;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employees {
    @Id
    @Column(name = "employee_id")
    int employeeId;

    @Column(name = "employee_name")
    String employeeName;

    public Employees(){

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int empId) {
        this.employeeId = empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String empName) {
        this.employeeName = empName;
    }
}
