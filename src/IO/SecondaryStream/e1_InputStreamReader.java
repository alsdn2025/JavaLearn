package IO.SecondaryStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class e1_InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);

        char[] cbuf = new char[100];
        while(reader.read(cbuf) > 0){
            String data = new String(cbuf);
            System.out.printf(data);
        }

        reader.close();
        is.close();

    }
}
