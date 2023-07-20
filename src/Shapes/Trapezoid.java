package Shapes;

import java.util.Random;

public class Trapezoid extends BasicShape{

    private double baseLengthA;
    private double baseLengthB;
    private double sideLengthA;
    private double sideLengthB;
    private double height;

    @Override
    public String draw() {
        return "Trapezoid";
    }
    @Override
    public double area() {
        double p = (baseLengthA + baseLengthB + sideLengthB + sideLengthA) / 2;
        double calc1 = baseLengthA + baseLengthB;
        double calc2 = Math.sqrt((p - baseLengthA) * (p - baseLengthA) * (p - baseLengthA - sideLengthB) * (p - baseLengthA - sideLengthA));
        double calc3 = Math.abs(baseLengthA - baseLengthB);

        double area = calc1 * calc2 / calc3;
        return area;
    }

    public double calculateHeight(){
       double height = 2*area()/baseLengthA+baseLengthB;
       return height;
    }
    public Trapezoid(Color color, double baseLengthA, double baseLengthB, double sideLengthA, double sideLengthB, double area, double height) {
        super(color);
        this.baseLengthA = baseLengthA;
        this.baseLengthB = baseLengthB;
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.height = height;
    }

    public Trapezoid(Color color, double baseLengthA, double baseLengthB, double sideLengthA, double sideLengthB) {
        super(color);
        this.baseLengthA = baseLengthA;
        this.baseLengthB = baseLengthB;
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
    }

    public double getSideLengthA(){
        return sideLengthA;
    }
    public double getSideLengthB(){
        return sideLengthB;
    }
    public double getBaseLengthA(){
        return baseLengthA;
    }
    public double getBaseLengthB(){
        return baseLengthB;
    }
    public double getHeight(){
        return height;
    }
    @Override
    public String toString() {
        return String.format("Shape: Trapezoid.," + " Area:"+area()+"., Color:"+getColor()+" ., Height:"+getHeight()+";");
    }
}
