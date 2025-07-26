public class CheckPalindromeString {
    public static void main(String[] args) {

        String input = "madam";

        String rev = new StringBuilder(input).reverse().toString();

        if(input.equals(rev)){
            System.out.println(rev + " is palindrome");
        } else {
            System.out.println( rev + " is not palindrome");
        }
    }
}
