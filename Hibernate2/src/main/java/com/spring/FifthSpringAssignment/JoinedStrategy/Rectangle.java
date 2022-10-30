package com.spring.FifthSpringAssignment.JoinedStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rectangle_shape")
public class Rectangle extends Shape{
    @Column(name = "length")
    private double length;

    @Column(name = "breadth")
    private double breadth;

    public Rectangle() {

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
