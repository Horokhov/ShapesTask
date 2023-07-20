package shapes;

public class Square extends BasicShape{
    private double sideLength;
    @Override
    public String draw() {
        return "Square";
    }
    @Override
    public double area() {
        return sideLength * sideLength;
    }
    public Square(Color color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }
    public double getSideLength(){
        return sideLength;
    }
    @Override
    public String toString() {
        return String.format("Shape: Square.," + " Area:"+area()+"., Color:"+getColor()+" ., Sidelength:"+getSideLength()+";");
    }
}
