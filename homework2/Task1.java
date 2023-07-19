package exception.homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void number(){
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter а fractional number: ");
        Double num = scanner.nextDouble();
        if (!(num instanceof Double)) {
            number();
            throw new InputMismatchException("You Enter string, enter again: ");

        }

        System.out.println(num);

         */



        boolean flag = false;
        while (flag == false) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter а fractional number: ");
                Double num = scanner.nextDouble();
                flag = true;
                System.out.println(num);
            } catch (InputMismatchException e) {
                //throw new RuntimeException("Enter again: ");
                System.out.println("You enter strung!!!" + e);
                System.out.println("Enter again: ");
                //Scanner scanner = new Scanner(System.in);
                //Double num = scanner.nextDouble();
            }
            }
    }
}
