import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Width:");
        int width = scanner.nextInt();
        System.out.println("input Height:");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("My Regtangle: "+rectangle.display());
        System.out.println("perimeter: "+rectangle.getPerimeter());
        System.out.println("Area: "+rectangle.getArea());
    }
}
