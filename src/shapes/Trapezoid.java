package shapes;

public class Trapezoid extends BasicShape{
    private double sideLengthA;
    private double sideLengthB;
    private double height;

    @Override
    public String draw() {
        return "Trapezoid";
    }
    @Override
    public double area() {
        return (sideLengthA + sideLengthB) * height / 2;
    }

    public Trapezoid(Color color, double sideLengthA, double sideLengthB, double area, double height) {
        super(color);
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.height = height;
    }

    public Trapezoid(Color color, double sideLengthA, double sideLengthB) {
        super(color);
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
    }

    public double getSideLengthA(){
        return sideLengthA;
    }
    public double getSideLengthB(){
        return sideLengthB;
    }
    public double getHeight(){
        return height;
    }
    @Override
    public String toString() {
        return String.format("Shape: Trapezoid.," + " Area:"+area()+"., Color:"+getColor()+" ., Height:"+getHeight()+";");
    }
}