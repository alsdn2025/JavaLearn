package IO.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class WriteExam {

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\OutputStream\\TextFile.txt");
        byte[] data = "ABC".getBytes();
        System.out.println("data : " + Arrays.toString(data));

        for (byte b : data) {
            os.write(b);
            System.out.printf(bytesToBinaryString(b));
            System.out.printf(System.lineSeparator());
        }
        os.flush();
        os.close();

        os = new FileOutputStream("D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\OutputStream\\TextFile.txt");
        os.write("ABCDE".getBytes(),1,2);
        os.flush();
        os.close();


    }



    static String bytesToBinaryString(Byte b) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            builder.append(((0x80 >>> i) & b) == 0 ? '0' : '1');
        }

        return builder.toString();
    }
}


