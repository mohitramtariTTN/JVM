package com.spring.FifthSpringAssignment.JoinedStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "square_shape")
public class Square extends Shape{
    @Column(name = "side")
    private double side;

    public Square(){

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
