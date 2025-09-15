import java.util.Arrays;

public class CheckIfArrayContainsTheGivenNumbers {
    public static void main(String[] args) {

        int[] array = {5, 7};

        // Print the original array
        System.out.println("Original Array is : " + Arrays.toString(array));

        if(array[0]==4 || array[0]==7){
            System.out.println("True");
        } else {
            // If the first element is not 4 or 7, check the second element and print the result
            System.out.println(array[1]==4 || array[1]==7);
        }
    }
}
