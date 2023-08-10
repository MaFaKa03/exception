package exception.homework3;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {
    private List<String> data;
    private long phone;
    private String surname;
    private String name;
    private String secondName;
    private String birthDay;
    private char sex;
    private File file;
    public PhoneBook(){}
    public PhoneBook(List<String> data){
        this.data = data;
        //this.file = file;
    }
    public void addContact(List<String> data) throws IOException {
        //List <String> data = new ArrayList<>();
        this.data = data;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        this.surname = surname;
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        this.name = name;
        System.out.println("Enter second name: ");
        String secondName = scanner.nextLine();
        this.secondName = secondName;
        if (surname.length() == 0 || name.length() == 0 || secondName.length() == 0)
            throw new NullPointerException("Wrong enter null!!!");
        data.add(0,surname);
        data.add(1,name);
        data.add(2,secondName);

        System.out.println("Enter birthDay ib format 'dd.mm.yyyy': ");
        String birthDay = scanner.nextLine();
        this.birthDay = birthDay;
        if (birthDay.length() != 10)
            throw new RuntimeException("Your enter wrong format date!!!");
        //data.add(3,birthDay);
        if (!(contains(birthDay, '.', 2)) || !(contains(birthDay, '.',5)))
            throw new RuntimeException("Enter birthDay for example: 'dd.mm.yyyy'");
        data.add(3,birthDay);

        System.out.println("Enter sex: ");
        char sex = scanner.next().charAt(0);
        this.sex = sex;
        //String sex = new String(char[0]);
        if (sex != 'f'&& sex != 'm')
            throw new RuntimeException("Your enter wrong sex!!!");
        data.add(4,Character.toString(sex));
        try {
            System.out.println("Enter phone number in format 89xxxxxxxxx : ");
            long phoneNumber = scanner.nextLong();
            this.phone = phoneNumber;
            String string = Long.toString(phoneNumber);
            if (string.length() != 11 || (string.charAt(0) != '8'))
                throw new RuntimeException("You enter wrong format phone number. Follow example: '89xxxxxxxxx'");
            data.add(5,string);

        } catch (InputMismatchException e){
            System.out.println("You enter string!");
        }

        //String fileSeparator = System.getProperty("file.separator");
        //String absolutPathFile = fileSeparator +
        //File file = new File(data.get(0));


        //this.file = file;
        saver(data);





        //List <String> data = new ArrayList<>();
        //data.add(0,surname);
        //data.add(1,name);
        //data.add(2,secondName);
        //data.add(3,birthDay);
        //data.add(4,);




    }
    public void printer(List<String> data){
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }
    private static void saver(List<String> data) throws IOException {
        File file = new File(data.get(0));
        if (file.exists()){
            /*try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                for (int i = 0; i < data.size(); i++) {
                    String result = data.get(i) + " ";
                    try {
                        writer.write(result);
                    }catch (IOException e){
                        System.out.println("Error write file");
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }

             */
            try (FileWriter writer = new FileWriter(file, true)){
                try {
                    writer.write("\n");
                } catch (IOException e){
                    System.out.println("Error write file!");
                }
                for (int i = 0; i < data.size(); i++) {
                 String result = data.get(i) + " ";
                 try {
                     writer.write(result);
                 }catch (IOException e){
                     System.out.println("Error write file!");
                 }
                }
            }catch (IOException e){
                System.out.println(e);
            }
        } else {
            file.createNewFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                for (int i = 0; i < data.size(); i++) {
                    String result = data.get(i) + " ";
                    try {
                        writer.write(result);
                    }catch (IOException e){
                        System.out.println("Error write file");
                    }
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }



    public List<String> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "data=" + data +
                ", phone=" + phone +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", sex=" + sex +
                '}';
    }

    private boolean contains(String birthDay, char substr, int index){
        if(birthDay.charAt(index) == substr)
            return true;
        return false;
    }
}
