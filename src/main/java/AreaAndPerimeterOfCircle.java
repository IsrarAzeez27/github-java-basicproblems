import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();

        double area = 2 * Math.PI * radius;
        double perimeter = Math.PI * radius * radius;

        System.out.println("Area of the cirlce is " + area);
        System.out.println("Perimeter of circle is " + perimeter);
    }
}
