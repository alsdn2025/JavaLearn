package IO.ConsoleClass;

import java.io.Console;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadLine_Pw {
    public static void main(String[] args) throws IOException {
        Console console = System.console();

        System.out.print("아이디 : ");
        String id = console.readLine();
        System.out.print("비밀번호 : ");
        char[] cPass = console.readPassword();

        System.out.write(id.getBytes());
        System.out.println();
        System.out.write(String.valueOf(cPass).getBytes());

    }
}
