package IO.SecondaryStream;

import java.io.*;

public class e5_BufferedOutputStream {
    public static String originFilePath = "D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\SecondaryStream\\Images\\Origin.jpg";
    public static String CopiedFilePath = "D:\\MyJava\\IdeaProject\\ThisJava_IO\\src\\IO\\SecondaryStream\\Images\\Copied.jpg";


    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = -1;
        long start = 0;
        long end = 0;

        fis = new FileInputStream(originFilePath);
        fos = new FileOutputStream(CopiedFilePath);


        start = System.currentTimeMillis();
        while((data = fis.read())!= -1){
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        System.out.println("입/출력버퍼 미사용시 : " + (end - start) + "ms");
        fos.close(); fis.close();


        fis = new FileInputStream(originFilePath);
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream(CopiedFilePath);

        start = System.currentTimeMillis();
        while((data=bis.read())!= -1){
            fos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        System.out.println("입력버퍼 사용, 출력버퍼 미사용시 : " + (end - start) + "ms");
        fos.close(); bis.close(); fis.close();


        fis = new FileInputStream(originFilePath);
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream(CopiedFilePath);
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while((data=bis.read())!= -1){
            bos.write(data);
        }
        fos.flush();
        end = System.currentTimeMillis();
        System.out.println("입/출력버퍼  사용시 : " + (end - start) + "ms");
        bos.close(); bis.close(); fis.close();

    }
}
