package shapes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainRunner {
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

            if(shapeType == 0){
                BasicShape.Color color = BasicShape.getRandomColor();
                double sideLength = BasicShape.getRandomLength();
                Square square = new Square(color,sideLength);
                double area = square.area();
                shapes.add(new Square(color, sideLength, area));
            } else if(shapeType == 1) {
                BasicShape.Color color = BasicShape.getRandomColor();
                double sideLengthA = BasicShape.getRandomLength();
                double sideLengthB = BasicShape.getRandomLength();
                Triangle triangle = new Triangle(color, sideLengthA, sideLengthB);
                double hypotenuse = triangle.calculateHypotenuse();
                double area = triangle.area();
                shapes.add(new Triangle(color, sideLengthA, sideLengthB, hypotenuse, area));
            } else if(shapeType == 2) {
                BasicShape.Color color = BasicShape.getRandomColor();
                double radius = BasicShape.getRandomLength();
                Circle circle = new Circle(color, radius);
                double area = circle.area();
                shapes.add(new Circle(color, radius, area));
            } else if(shapeType == 3){
                BasicShape.Color color = BasicShape.getRandomColor();
                double baseLengthA = BasicShape.getRandomLength();
                double baseLengthB = BasicShape.getRandomLength();
                double sideLengthA = BasicShape.getRandomLength();
                double sideLengthB = BasicShape.getRandomLength();
                Trapezoid trapezoid = new Trapezoid(color, baseLengthA, baseLengthB, sideLengthA, sideLengthB);
                double area = trapezoid.area();
                double height = trapezoid.calculateHeight();
                shapes.add(new Trapezoid(color, baseLengthA, baseLengthB, sideLengthA, sideLengthB, area, height));
            }

        }
        return shapes;
    }
}
