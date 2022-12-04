package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Circle")
public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius){
        setColor(color);        
        this.radius = radius;

    }
    
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
