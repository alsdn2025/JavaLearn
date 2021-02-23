package IO.SecondaryStream;

import java.io.*;

public class e3_BufferedInputStream {
    public static void main(String[] args) throws IOException {
        long start = 0;
        long end = 0;

        FileInputStream fis = new FileInputStream("D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\SecondaryStream\\Images\\Origin.jpg");
        start = System.currentTimeMillis();
        while((fis.read() != -1 )){}
        end = System.currentTimeMillis();
        System.out.println("버퍼 미사용시의 읽어오는 시간 : " + (end - start) +"ms");
        fis.close();

        fis = new FileInputStream("D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\SecondaryStream\\Images\\Origin.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        start = System.currentTimeMillis();
        while((bis.read() != -1 )){}
        end = System.currentTimeMillis();
        System.out.println("버퍼  사용시의 읽어오는 시간 : " + (end - start) +"ms");
        bis.close();
        fis.close();



    }
}
