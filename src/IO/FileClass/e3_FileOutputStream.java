package IO.FileClass;

import java.io.*;

public class e3_FileOutputStream {
    public static void main(String[] args) throws IOException {
        String originFilePath =
                "C:\\Users\\alsdn\\Desktop\\Origin.jpg";
        String copyFilePath =
                "D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\FileClass\\Copy.jpg";

        FileInputStream fis = new FileInputStream(originFilePath);
        FileOutputStream fos = new FileOutputStream(copyFilePath);


        fos.write(fis.readAllBytes());
        System.out.println("복사 완료");

        fos.flush();
        fos.close();
        fis.close();


    }
}
