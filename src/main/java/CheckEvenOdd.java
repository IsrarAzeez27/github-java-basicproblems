import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

            if(i % 2 != 0){
                System.out.println("The number is odd: " + i);
            } else {
                System.out.println("The number is even : " + i);
            }
        }
    }
