package org.example;

import java.util.Scanner;

public class AreaAndPerimterOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        double Area = Math.PI * radius * radius;
        double Perimeter = 2 * Math.PI * radius;

        System.out.println("The area of the circle is " + Area);
        System.out.println("The perimter of the circle is " + Perimeter);
    }
}
