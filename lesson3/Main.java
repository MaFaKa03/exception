package exception.lesson3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFound {
        /*
        try {
            doSomething();
        } catch (IOException e) {
            System.out.println("Eror " + e);
        }

         */
        //-----------------------------------//

        /*
        try (Counter counter = new Counter()){
            System.out.println(counter.count);
            counter.add();
            System.out.println(counter.count);
            //counter.close();
            counter.add();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         */
        //------------------------------------
        /*

        try {
            int a = 10/0;
        }catch (ArithmeticException e){
            throw new DivZero(e.getMessage());
        }

         */
        //-----------------------------------
        /*
        Integer[] array = new Integer[4];
        if (array[3] == null)
            throw new NullBounds(4);

         */
        //------------------------------------
        try(FileReader reader = new FileReader("test")) {
            reader.toString();
        }catch (IOException e){
            throw new FileNotFound("test");
        }

    }

}
