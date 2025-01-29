import java.util.Scanner;

public class ComapareNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.printf("%d == %d\n", a, b);
        }
        if (a != b) {
            System.out.printf("%d != %d\n", a, b);
        }
        if (a > b) {
            System.out.printf("%d > %d\n", a, b);
        }
        if (a < b) {
            System.out.printf("%d < %d\n", a, b);
        }
        if (a >= b) {
            System.out.printf("%d >= %d\n", a, b);
        }
        if (a <= b) {
            System.out.printf("%d <= %d\n", a, b);
        }
    }
}
