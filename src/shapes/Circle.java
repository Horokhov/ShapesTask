package shapes;

public class Circle extends BasicShape{
    private double radius;

    @Override
    public String draw() {
        double diameter = 2 * radius;
        double centerX = radius;
        double centerY = radius;

        for (int y = 0; y <= diameter; y++) {
            for (int x = 0; x <= diameter; x++) {
                int distanceToCenter = (int) Math.sqrt((x - centerX) * (x - centerX) + (y - centerY) * (y - centerY));
                if (distanceToCenter >= radius - 1 && distanceToCenter <= radius + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return null;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Shape: Circle.," + " Area:"+area()+"., Color:"+BasicShape.getRandomColor()+" ., Radius:"+getRadius()+";"+draw());
    }
}
