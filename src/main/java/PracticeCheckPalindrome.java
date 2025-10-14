public class PracticeCheckPalindrome {

    public static void main(String[] args) {
        int num = 123;
        if(isPalindrome(num)){
            System.out.println(num + " is Palindrome");
        } else
            System.out.println(num + " is not palindrome");
    }

    public static boolean isPalindrome(int number){
        int original = number;
        int reversed = 0;

        while(number > 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return original == reversed;
    }
}
