package org.example;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;

        System.out.println("Before swaping of number a, b , " + a + " , " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swaping of number a, b , " + a + " , " + b);
    }
}
