package IO.FileClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class e2_FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream is = new FileInputStream(
                "D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\FileClass\\e2_FileInputStream.java"
        );

        String data = new String(is.readAllBytes());
        System.out.print(data);

        is.close();


    }
}
