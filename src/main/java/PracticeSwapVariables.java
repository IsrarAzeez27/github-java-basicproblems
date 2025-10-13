public class PracticeSwapVariables {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int temp;

        System.out.println("Numbers before swapping a, b = " + a + " , " + b );

        temp = a;
        a = b;
        b = temp;

        System.out.println("Numbers after swapping a, b = " + a + " , " + b );
    }
}
