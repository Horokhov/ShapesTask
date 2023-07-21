package shapes;

public class Trapezoid extends BasicShape{
    private double sideLengthA;
    private double sideLengthB;
    private double height;
    @Override
    public String draw() {
        double totalWidth = sideLengthA + (2 * (sideLengthB - sideLengthA));
        double midPoint = totalWidth / 2;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < totalWidth; col++) {
                if (col >= midPoint - (sideLengthB / 2) && col < midPoint + (sideLengthB / 2) + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            midPoint++;
        }
        return null;
    }
    @Override
    public double area() {
        return (sideLengthA + sideLengthB) * height / 2;
    }
    public Trapezoid(Color color, double sideLengthA, double sideLengthB, double height) {
        super(color);
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return String.format("Shape: Trapezoid.," + " Area:"+area()+"., Color:"+BasicShape.getRandomColor()+" ., Height:"+getHeight()+";"+draw());
    }
}
