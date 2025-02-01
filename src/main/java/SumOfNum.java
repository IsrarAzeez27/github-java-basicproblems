import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();


        System.out.println("The sum of numbers is " + sumNumbers(n));
    }

    public static long sumNumbers ( long n) {
        long sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}
