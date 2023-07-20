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
                Circle circle = createRandomCircle();
                shapes.add(circle);
            } else if(shapeType == trapezoid){
                Trapezoid trapezoid = createRandomTrapezoid();
                shapes.add(trapezoid);
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
    public static Circle createRandomCircle(){
        BasicShape.Color color = BasicShape.getRandomColor();
        double radius = BasicShape.getRandomLength();
        return new Circle(color, radius);
    }

    public static Trapezoid createRandomTrapezoid(){
        BasicShape.Color color = BasicShape.getRandomColor();
        double sideLengthA = BasicShape.getRandomLength();
        double sideLengthB = BasicShape.getRandomLength();
        double height = BasicShape.getRandomLength();
        return new Trapezoid(color, sideLengthA, sideLengthB, height);
    }
}
