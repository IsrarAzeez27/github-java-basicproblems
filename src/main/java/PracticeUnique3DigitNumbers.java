public class PracticeUnique3DigitNumbers {
    public static void main(String[] args) {

        int amount = 0;

        // Iterate through three nested loops to generate all unique three-digit numbers
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                for(int k=1; k<=4; k++){
                    // Check if 'i,' 'j,' and 'k' are all different (not equal)
                    if(i!=k && k!=j && i!=j){
                        amount++;
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }

        // Display the total number of generated three-digit numbers
        System.out.println("Total number of 3 digit numbers is " + amount);
    }
}
