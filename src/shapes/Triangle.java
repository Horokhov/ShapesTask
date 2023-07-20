package shapes;

public class Triangle extends BasicShape{
    private double sideLengthA;
    private double sideLengthB;
    @Override
    public String draw() {
        return "Triangle";
    }
    @Override
    public double area() {
        double hypotenuse = calculateHypotenuse();
        double s = (sideLengthA + sideLengthB + hypotenuse)/2;
        return Math.sqrt(s * (s - sideLengthA) * (s - sideLengthB) * (s - hypotenuse));
    }

    public double calculateHypotenuse(){
        double hypotenuseSquare = sideLengthA * sideLengthA + sideLengthB * sideLengthB;
        return Math.sqrt(hypotenuseSquare);
    }
    public Triangle(Color color, double sideLengthA, double sideLengthB) {
        super(color);
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
    }
    @Override
    public String toString() {
        return String.format("Shape: Triangle.," + " Area:"+area()+"., Color:"+getColor()+" ., Hypotenuse:"+calculateHypotenuse()+";");
    }
}
