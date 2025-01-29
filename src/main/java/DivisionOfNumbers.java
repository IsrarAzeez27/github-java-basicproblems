import java.util.Scanner;

public class DivisionOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        double z = x / y;

        System.out.println("Division of " + x + " & " + y + " is " + z);
    }
}
