import java.util.Scanner;

public class ReverseStringPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("The input string is: ");

        char[] letters = sc.nextLine().toCharArray();

        System.out.print("The Reverse String is ");

        for(int i=letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }
        System.out.print("\n");
    }
}
