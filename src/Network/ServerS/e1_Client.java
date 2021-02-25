package Network.ServerS;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class e1_Client {
    public static void main(String[] args) {
        Socket socket = new Socket();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("접속 요청");
//            socket.connect(new InetSocketAddress("localhost",5001));
            socket.connect(new InetSocketAddress("192.168.10.104", 5001));
            System.out.println("접속 성공");

            byte[] bytes = null;
            String message = null;

            System.out.print("보낼 데이터 입력 : ");
            message = scanner.nextLine();
            OutputStream os = socket.getOutputStream();
            bytes = message.getBytes(StandardCharsets.UTF_8);
            os.write(bytes);
            os.flush();
            System.out.println("데이터 전송 완료!");

            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            char[] inputData = new char[100];
            isr.read(inputData);
            System.out.println("응답 수신 완료!");
            System.out.println("받은 데이터 : " + new String(inputData));

            isr.close(); is.close(); os.close();
        }catch (IOException e ){
            e.printStackTrace();
        }

        if(!socket.isClosed()){
            try {
                socket.close();
            } catch (IOException exception) {}
        }

    }
}
