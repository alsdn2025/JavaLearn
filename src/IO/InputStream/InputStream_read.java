package IO.InputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class InputStream_read {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\InputStream\\TextFile.txt");
            int readByte;
            while((readByte=is.read()) != -1 ){
                System.out.println(readByte + " Binary : "
                                    + Integer.toBinaryString(readByte));
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(System.lineSeparator());


        try {
            InputStream is = new FileInputStream("D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\InputStream\\TextFile.txt");
            int readLength;
            byte[] readBytes = new byte[3];
            while((readLength = is.read(readBytes)) != -1 ){
                System.out.println("Read Length : " + readLength);
                System.out.println("Bytes : " + Arrays.toString(readBytes));
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.print(System.lineSeparator());

        try {
            InputStream is = new FileInputStream("D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\InputStream\\TextFile.txt");
            int readLength;
            byte[] readBytes = new byte[31];
            readLength = is.read(readBytes,2,20);
            System.out.println("Read Length :" + readLength);
            System.out.println(Arrays.toString(readBytes));
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
