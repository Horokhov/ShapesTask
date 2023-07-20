package shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainRunner {
    private static final int square = 0;
    private static final int triangle = 1;
    private static final int circle = 2;
    private static final int trapezoid = 3;
    public static void main(String[] args) {
        List<BasicShape> shapesOutput =  generateRandomShapes();

        for (BasicShape basicShape : shapesOutput) {
            System.out.println(basicShape);
        }

    }
    public static List<BasicShape> generateRandomShapes(){
        List<BasicShape> shapes = new ArrayList<>();
        Random random = new Random();
        int numberOfShapes = random.nextInt(5)+5;

        for (int i = 0; i < numberOfShapes; i++) {
            int shapeType = random.nextInt(4);

            if(shapeType == square){
                Square square = createRandomSquare();
                shapes.add(square);
            } else if(shapeType == triangle) {
                Triangle triangle = createRandomTriangle();
                shapes.add(triangle);
            } else if(shapeType == circle) {
                BasicShape.Color color = BasicShape.getRandomColor();
                double radius = BasicShape.getRandomLength();
                Circle circle = new Circle(color, radius);
                double area = circle.area();
                shapes.add(new Circle(color, radius, area));
            } else if(shapeType == trapezoid){
                BasicShape.Color color = BasicShape.getRandomColor();
                double sideLengthA = BasicShape.getRandomLength();
                double sideLengthB = BasicShape.getRandomLength();
                double height = BasicShape.getRandomLength();
                Trapezoid trapezoid = new Trapezoid(color, sideLengthA, sideLengthB);
                double area = trapezoid.area();
                shapes.add(new Trapezoid(color,sideLengthA, sideLengthB, area, height));
            }

        }
        return shapes;
    }

    public static Square createRandomSquare(){
        BasicShape.Color color = BasicShape.getRandomColor();
        double sideLength = BasicShape.getRandomLength();
        return new Square(color, sideLength);
    }

    public static Triangle createRandomTriangle(){
        BasicShape.Color color = BasicShape.getRandomColor();
        double sideLengthA = BasicShape.getRandomLength();
        double sideLengthB = BasicShape.getRandomLength();
        return new Triangle(color, sideLengthA, sideLengthB);
    }
}
