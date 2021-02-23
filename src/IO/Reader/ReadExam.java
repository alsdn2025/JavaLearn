package IO.Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReadExam {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\Reader\\TextFile.txt");
        int readData;
        while((readData = reader.read()) != -1 ){
            System.out.print((char)readData);
        }
        reader.close();

        System.out.printf(System.lineSeparator());
        System.out.printf(System.lineSeparator());

        reader =new FileReader("D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\Reader\\TextFile.txt");
        int readCharNum;
        char[] cbuf = new char[2];
        StringBuilder sb = new StringBuilder();

        while((readCharNum = reader.read(cbuf)) != -1){
            System.out.println("Read char num : " + readCharNum);
            sb.append(cbuf);
        }
        System.out.println(sb.toString());

    }

}
