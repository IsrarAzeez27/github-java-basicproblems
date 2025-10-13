import java.util.Scanner;

public class PracticeReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String to Reverse.");
        char[] letters = sc.nextLine().toCharArray();

        System.out.println("Reverse of a String is : ");

        for(int i=letters.length-1; i>=0; i--){
            System.out.print(letters[i]);
        }
        System.out.println();
    }
}
