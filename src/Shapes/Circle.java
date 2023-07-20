package Shapes;

import java.util.Random;

public class Circle extends BasicShape{
    private double radius;
    @Override
    public String draw() {
        return "Circle";
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(Color color, double radius, double area) {
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    @Override
    public String toString() {
        return String.format("Shape: Circle.," + " Area:"+area()+"., Color:"+getColor()+" ., Radius:"+getRadius()+";");
    }
}
