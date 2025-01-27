package org.example;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for(int i=0; i<10; i++){
            System.out.println(number + " X " + (i+1) + " = " + (number*(i+1)));
        }
    }
}
