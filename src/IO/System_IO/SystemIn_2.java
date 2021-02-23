package IO.System_IO;

import java.io.IOException;
import java.io.InputStream;

public class SystemIn_2 {
    public static void main(String[] args) throws IOException {


        InputStream SystemIn = System.in;
        byte[] datas = new byte[100];
        System.out.print("이름 : ");
        int nameBytes = SystemIn.read(datas);
        String s = new String(datas,0,nameBytes-2);

        System.out.write(datas);

        System.out.printf("중단점");

    }
}
