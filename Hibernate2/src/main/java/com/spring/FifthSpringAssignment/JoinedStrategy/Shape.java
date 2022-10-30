package com.spring.FifthSpringAssignment.JoinedStrategy;

import javax.persistence.*;

@Entity
@Table(name = "shape")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Shape {
    @Id
    @Column(name = "shape_no")
    private Integer id;

    @Column(name = "shape_type")
    private String shapeType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String  getShapeType() {
        return shapeType;
    }

    public void setShapeType(String  shapeType) {
        this.shapeType = shapeType;
    }
}
