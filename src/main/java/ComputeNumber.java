import java.util.Scanner;

public class ComputeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Input a number: ");
        n = sc.nextInt();

        System.out.printf("%d + %d%d + %d%d%d\n" , n,n,n,n,n,n);
    }
}
