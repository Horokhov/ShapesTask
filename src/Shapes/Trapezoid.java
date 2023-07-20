package Shapes;

import java.util.Random;

public class Trapezoid extends BasicShape{

    private double baseLengthA;
    private double baseLengthB;
    private double height;

    @Override
    public String draw() {
        return "Trapezoid";
    }
    @Override
    public double area() {
        return 0.5 * (baseLengthA + baseLengthB) * height;
    }
    public Trapezoid(Color color, double baseLengthA, double baseLengthB, double height) {
        super(color);
        this.baseLengthA = baseLengthA;
        this.baseLengthB = baseLengthB;
        this.height = height;
    }
}
