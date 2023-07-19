package exception.lesson3;

import java.io.FileNotFoundException;

public class FileNotFound extends FileNotFoundException {
    public FileNotFound(String massage){
        super("File on url " + massage + " not found");

    }

}
