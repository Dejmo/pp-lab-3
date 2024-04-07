import geometry.Circle;
import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(new Point(0, 0), 5);
         circles[1] = new ColoredCircle(new Point(2, 2), 3, "Niebieski");

        for (Circle circle : circles) {
            double area = circle.getArea();
            System.out.println("Pole powierzchni koła: " + area);

            if (circle instanceof ColoredCircle) {
                String color = ((ColoredCircle) circle).getColor();
                System.out.println("Kolor koła: " + color);
            }
        }
    }
}
