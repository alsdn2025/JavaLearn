package IO.SecondaryStream;

import java.io.*;

public class e4_BufferedReader {
    public static void main(String[] args) throws IOException {
        // 바이트기반 인풋스트림
        InputStream is = System.in;
        // 문자->바이트로 읽어오는 보조스트림
        Reader reader = new InputStreamReader(is);
        // 버퍼스트림
        BufferedReader br = new BufferedReader(reader);

        System.out.print("입력 : ");
        String strInput = br.readLine(); // 버퍼드리더로 한 줄씩 읽을 수 있다.
        System.out.println("출력 : "+strInput);

        br.close();
        reader.close();
        is.close();

    }
}
