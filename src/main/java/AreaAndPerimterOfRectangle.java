import java.util.Scanner;

public class AreaAndPerimterOfRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float width = sc.nextFloat();
        float height = sc.nextFloat();

        double area = 2 * ( width + height);
        double perimeter = width * height;

        System.out.println("The area of given rectangle is " + area);
        System.out.println("The perimeter of given rectangle is " + perimeter);
    }
}
