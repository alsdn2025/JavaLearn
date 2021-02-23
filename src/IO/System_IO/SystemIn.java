package IO.System_IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class SystemIn {
    public static void main(String[] args) throws IOException {
        System.out.println("==선택==");
        System.out.println("1 ==");
        System.out.println(" 2 ==");
        System.out.println("  3 ==");

        char inputChar = (char)System.in.read();
        switch (inputChar) {
            case '1' :
                System.out.println("1번 선택스");
                break;
            default:
                break;
        }

        InputStream SystemIn = System.in;
        byte[] datas = new byte[100];
        System.out.print("이름 : ");
        int nameBytes = SystemIn.read(datas);

        System.out.printf("중단점");

    }
}
