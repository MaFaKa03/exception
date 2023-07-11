package exception.lesson1;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        array[0] = null;
        checkArray(array);
    }

    public static void checkArray(Integer[] array){
        String eror = new String();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                eror = eror + " " + i;
        }
        if (eror.length() > 0)
            throw new RuntimeException( "нулл находится на позиции: " + eror);
    }
}
