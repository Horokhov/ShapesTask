package Shapes;

import java.awt.*;
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
        int shape = random.nextInt(10);

        for (int i = 0; i < shape; i++) {

            if(shape == 0){
                BasicShape.Color color = BasicShape.getRandomColor();
                double sideLength = BasicShape.getRandomLength();
                Square square = new Square(color,sideLength);
                double area = square.area();
                shapes.add(new Square(color, sideLength, area));
            } else if(shape == 1) {
                BasicShape.Color color = BasicShape.getRandomColor();
                double sideLengthA = BasicShape.getRandomLength();
                double sideLengthB = BasicShape.getRandomLength();
                Triangle triangle = new Triangle(color, sideLengthA, sideLengthB);
                double hypotenuse = triangle.calculateHypotenuse();
                double area = triangle.area();
                shapes.add(new Triangle(color, sideLengthA, sideLengthB, hypotenuse));
            }

        }
        return shapes;
    }
}