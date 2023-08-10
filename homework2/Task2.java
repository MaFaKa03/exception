package exception.homework2;

public class Task2 {
    public static void test(){
        int [] intArray = new int[8];
        try {
            int d = 0;
            double catchedRes1 = intArray.length / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
