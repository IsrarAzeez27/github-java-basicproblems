import java.util.Scanner;

public class PracticeMultiplicationTable2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int n = sc.nextInt();

        for(int i=0; i<10; i++){
            System.out.println(n + " X " + (i+1) + " = " + n*(i+1));
        }
    }
}
