import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));

        // Rotate to the right by 1
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.println("Rotated array:  " + Arrays.toString(arr));
    }
}
