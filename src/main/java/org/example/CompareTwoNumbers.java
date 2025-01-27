package org.example;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if ( x != y){
            System.out.printf("%d != %d", x, y);
        } if ( x == y ){
            System.out.printf("%d == %d", x, y);
        } if ( x > y ){
            System.out.printf("%d > %d", x, y);
        } if ( x < y ){
            System.out.printf("%d < %d", x, y);
        }

    }
}
