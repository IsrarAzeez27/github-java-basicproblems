import java.util.Scanner;

public class AreaOfPolygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number of sides of polygon");
        int ns = sc.nextInt();

        System.out.println("Input the length of one of the sides");
        double side = sc.nextDouble();

        System.out.println("The Area of Polygon is " + polygonArea(ns, side));
        }

    public static double polygonArea(int ns, double side){
        return (ns * (side * side )) / (4 * Math.tan(Math.PI / ns));
    }
}
