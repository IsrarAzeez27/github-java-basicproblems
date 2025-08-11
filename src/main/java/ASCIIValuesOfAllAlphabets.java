public class ASCIIValuesOfAllAlphabets {
    public static void main(String[] args) {

        // Uppercase letters
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print(ch + " : " + (int)ch + "\t");
        }

        System.out.println();

        // Lowercase letters
        for(char ch='a'; ch<='z';ch++){
            System.out.print (ch + " : " + (int)ch + "\t");
        }
    }
}
