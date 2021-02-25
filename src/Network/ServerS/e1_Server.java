package Network.ServerS;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class e1_Server {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket();
//        serverSocket.bind(new InetSocketAddress("localhost",5001));
        serverSocket.bind(new InetSocketAddress("192.168.10.104",5001));

        while(true){
            System.out.println("연결 요청 기다림..");
            Socket socket = serverSocket.accept(); // 클라이언트가 연결요청을 할 때까지 블로킹됨
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("연결 수락!");
            System.out.println("접속한 클라이언트 host name : " + isa.getHostName());
            System.out.println("접속한 클라이언트 IP : " + isa.getAddress());

            byte[] bytes = new byte[100];
            String message = null;
            InputStream is = socket.getInputStream();
            int readByteCount = is.read(bytes);

            System.out.println("받은 데이터 용량 : " + readByteCount + "bytes");
            System.out.println("받은 데이터 내용 : " +
                    new String(bytes,0,readByteCount, StandardCharsets.UTF_8));


            OutputStream os = socket.getOutputStream();
            System.out.print("보낼 데이터 : ");
            String str = scanner.nextLine();
            OutputStreamWriter osw = new OutputStreamWriter(os,StandardCharsets.UTF_8);
            osw.write(str); osw.flush();
            System.out.println("전송 완료!");

            socket.close(); is.close(); os.close(); osw.close();
        }

//        if(!serverSocket.isClosed()){
//            serverSocket.close();
//        }


    }
}
