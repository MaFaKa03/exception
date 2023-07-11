package exception.lesson1;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(2);
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }


        System.out.print(sum(array));
    }
    public static int sum(int[][] array){
        int sum = 0;
        if (array.length != array[0].length)
            throw new RuntimeException("array not quard");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1)
                    throw new RuntimeException("value isn't 0 and 1");
                sum += array[i][j];
            }
        }
        return sum;
    }
}
