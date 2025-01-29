import java.util.Scanner;

public class MultiplicationOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        double z = x * y;

        System.out.println("Multiplication of " + x + " & " + y + " is " + z);
    }
}
