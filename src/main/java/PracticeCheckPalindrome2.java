public class PracticeCheckPalindrome2 {

    public static void main(String[] args) {
        int num = 111;
        if(isPalindrome(num)){
            System.out.println(num + " is palindrome");
        } else
            System.out.println(num + " is not palindrome");
    }

    public static Boolean isPalindrome(int number){
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
