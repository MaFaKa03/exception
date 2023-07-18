package exception.lesson2;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        File file = new File("/Users/mafaka03/Documents/exeption.java/exception/lesson2/Test.txt");
        HashMap<String, String> myHashMap = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String stringName = new String();

            while ((stringName = reader.readLine()) != null){
                String[] array = stringName.split("=");
                if (array[1].equals("?")){
                    array[1] = String.valueOf(array[0].length());
                }
                myHashMap.put(array[0], array[1]);

            }
        }catch (IOException e){
            System.out.println(e);
        }

        writeFile(file, myHashMap);

    }
    public static void writeFile(File file, HashMap myHashMap){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            myHashMap.forEach((key, value) -> {
                String result = key + "=" + value;
                try {
                    writer.write(result + "\n");
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
            }) ;
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
