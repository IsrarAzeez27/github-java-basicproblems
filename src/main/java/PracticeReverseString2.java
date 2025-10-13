import java.util.Scanner;

public class PracticeReverseString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a String to Reverse: ");
        char[] s = sc.nextLine().toCharArray();

        System.out.print("The Reversed String is: ");
        for(int i=s.length-1; i>=0; i--){
            System.out.print(s[i]);
        }
        System.out.println();
    }
}
