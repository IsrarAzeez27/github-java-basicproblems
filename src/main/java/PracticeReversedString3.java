import java.util.Scanner;

public class PracticeReversedString3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String to reverse: ");
        char[] S = sc.nextLine().toCharArray();

        System.out.print("The revered string is: ");
        for(int i=S.length-1; i>=0; i--){
            System.out.print(S[i]);
        }
        System.out.println();
    }
}
