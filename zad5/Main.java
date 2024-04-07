import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {

         Rectangle rectangle = new Rectangle(5, 3);

        System.out.println("Właściwości prostokąta:");
        System.out.println("Długość: " + rectangle.getLength());
        System.out.println("Szerokość: " + rectangle.getWidth());
        System.out.println("Pole: " + rectangle.calculateArea());
        System.out.println("Obwód: " + rectangle.calculatePerimeter());
    }
}
