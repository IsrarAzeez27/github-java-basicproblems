package org.example;

import java.util.Scanner;

public class ProductOf2Numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        float z = x * y;

        System.out.println("The product of " + x + " and " + y + " is " + z);
    }
}
