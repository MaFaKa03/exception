package exception.homework2;

import java.util.Scanner;

public class Task4 {
    public static void stringEx(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String string = scanner.nextLine();
        if (string.length() == 0)
            throw new NullPointerException("Wrong enter null!!!");
        System.out.println(string);

    }
}
