package com.spring.FifthSpringAssignment.TablePerClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "full_time_employee")
public class FullTimeEmployee extends Employees {
    @Column(name = "salary")
    private Integer salary;

    public FullTimeEmployee() {

    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
