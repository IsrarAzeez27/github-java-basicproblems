package org.example;

import java.util.Scanner;

public class AverageOf3Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        double avg = (x+y+z)/3;

        System.out.println("The Average of " + x + " and " + y + " and " + z + " is " + avg);
    }
}
