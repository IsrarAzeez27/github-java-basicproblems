import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;

        System.out.println("Before swapping : a , b = " + a + " , " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : a , b = " + a + " , " + b);

    }
}
