public class SwapVariable2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Before swapping = "+ a + " , " + b);

        a = a + b; // 15
        b= a - b; // 10
        a = a - b; // 5

        System.out.println("After swapping = "+ a + " , " + b);
    }
}
