package shapes;

public class Square extends BasicShape{
    private double sideLength;
    @Override
    public String draw() {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return null;
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
        return String.format("Shape: Square.," + " Area:"+area()+"., Color:"+BasicShape.getRandomColor()+" ., Sidelength:"+getSideLength()+";"+draw());
    }
}
