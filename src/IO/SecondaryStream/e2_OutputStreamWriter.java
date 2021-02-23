package IO.SecondaryStream;

import java.io.*;

public class e2_OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
        Writer writer = new OutputStreamWriter(fos);

        writer.write("문자열 데이터");


        writer.flush();
        writer.close();
        fos.close();
        System.out.println("파일 저장 완료");
    }
}
