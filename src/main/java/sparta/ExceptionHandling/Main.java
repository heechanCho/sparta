package sparta.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileOutputStream out = new FileOutputStream("text.txt")) {

            out.write("Hello Sparta".getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
