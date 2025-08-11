public class PrintEvenNumber {
    public static void main(String[] args) {

        // Iterate through numbers from 1 to 100
        for(int i=0; i<=100; i++){
            // Check if the number is Even
            if(i % 2 == 0){
                // Print the Even number
                System.out.print(i + "\t");
            }
        }
    }
}
