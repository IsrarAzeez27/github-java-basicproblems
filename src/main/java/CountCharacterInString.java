public class CountCharacterInString {
    public static void main(String[] args) {

        // Define a test string containing letters, numbers, spaces, and other characters
        String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 Test ";
        // Call the count method to analyze the characters in the test string
        count(test);
    }

    public static void count(String x){
        // Convert the input string to a character array
        char[] ch = x.toCharArray();

        // Initializing count for letters, space, numbers and other characters
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        // Iterate through the character array to categorize characters
        for(int i=0; i<x.length(); i++){
            // Check if the character is a letter
            if(Character.isLetter(ch[i])){
                letter++;
            }
            // Check if the character is a digit (number)
            else if(Character.isDigit(ch[i])){
                number++;
            }
            // Check if the character is a space
            else if(Character.isSpaceChar(ch[i])){
                space++;
            }
            // Character falls into the "other" category if none of the above conditions are met
            else {
                other++;
            }
        }

        // Display original string
        System.out.println("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");

        //Display count of Letter, Space, Number, others
        System.out.println("Letters: " + letter);
        System.out.println("Spaces: " + space);
        System.out.println("Numbers: " + number);
        System.out.println("Others: " + other);
    }
}