package exception.homework3;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> data = new ArrayList<>();
        //File file = null;
       PhoneBook phoneBook = new PhoneBook(data);
       phoneBook.addContact(data);
       //phoneBook.toString();
       //phoneBook.printer(data);


    }
}
