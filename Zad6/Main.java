import geometry.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(4);

        System.out.println("Właściwości kwadratu:");
     System.out.println("Długość boku: " + square.getLength()); 
        System.out.println("Pole: " + square.calculateArea()); 
        System.out.println("Obwód: " + square.calculatePerimeter()); 
    }
}
