import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for nn & nnn
        int nn = Integer.parseInt(n + "" + n);
        int nnn = Integer.parseInt(n + "" + n + "" + n);

        // Output
        System.out.println("n : " + n);
        System.out.println("nn : " + nn);
        System.out.println("nnn : " + nnn);

        // Display Number in Specific order
        System.out.printf("Display Number in Specific order = " + "%d + %d%d + %d%d%d\n" , n,n,n,n,n,n);
    }
}
