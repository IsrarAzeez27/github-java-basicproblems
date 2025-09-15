import java.util.Arrays;

public class RotateAnArrayOfIntegers {
    public static void main(String[] args) {

        // Define an integer array
        int[] array1 = {20,30,40,50};

        // Print the elements of the original array
        System.out.println("The original array is : " + Arrays.toString(array1));

        // Create a new array by rotating the elements of the original array
        int[] array_new = {array1[3], array1[2], array1[1], array1[0]};

        // Print the elements of the rotated array
        System.out.println("Rotated Array : " + Arrays.toString(array_new));
    }
}
