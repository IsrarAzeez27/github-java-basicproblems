public class PrintOddNumbers {
    public static void main(String[] args) {

        // Iterate through numbers from 1 to 99
        for(int i=0; i<100; i++){
            // Check if the number is odd
            if(i % 2 != 0){
                // Print the odd number
                System.out.print(i + "\t");
            }
        }
    }
}
