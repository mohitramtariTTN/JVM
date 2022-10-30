package com.spring.FifthSpringAssignment.ComponentMapping;

import javax.persistence.*;

@Entity
public class Employeee {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;

    /*** @Embedded is used to embed EmployeeSalary in this class **/

    /**@AttributeOverride is used to override the EmployeeSalary's instances in the database table by the names that I have passed in the column field below ***/
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "basicSalary", column = @Column(name = "employee_basic_salary")),
            @AttributeOverride(name = "bonusSalary", column = @Column(name = "employee_bonus_salary")),
            @AttributeOverride(name = "taxAmount", column = @Column(name = "employee_tax_amount")),
            @AttributeOverride(name = "specialAllowanceSalary", column = @Column(name = "employee_special_allowance_salary"))
    })
    private EmployeeSalary employeeSalary;

    public Employeee(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EmployeeSalary getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(EmployeeSalary employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
