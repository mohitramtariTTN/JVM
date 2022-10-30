package com.spring.FifthSpringAssignment.ComponentMapping;

import javax.persistence.Embeddable;

/*** @Embeddable is used to declare that a class will be embedded by other classes ***/
@Embeddable
public class EmployeeSalary {
    private double basicSalary;
    private double bonusSalary;
    private double taxAmount;
    private double specialAllowanceSalary;

    public EmployeeSalary(){

    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(double specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
