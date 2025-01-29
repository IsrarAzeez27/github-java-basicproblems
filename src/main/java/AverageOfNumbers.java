import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        double average = (x + y + z) / 3;

        System.out.println("The average of " + x + "," + y + " & " + z + " is " + average );
    }
}
