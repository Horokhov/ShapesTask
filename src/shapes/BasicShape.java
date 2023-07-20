package shapes;

import java.util.Random;

abstract class BasicShape {
    enum Color{
        BLUE, RED, PURPLE, BLACK, WHITE, YELLOW;
    }
    public static Color getRandomColor(){
        Random random = new Random();
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
    private Color color;
    public abstract String draw();
    public abstract double area();

    public static double getRandomLength(){
        Random random = new Random();
        return random.nextDouble(100);
    }

    public BasicShape(Color color){
        this.color = color;
    }
    public Color getColor(){
        return color;
    }
}
