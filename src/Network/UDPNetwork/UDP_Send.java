package Network.UDPNetwork;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDP_Send {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();
        System.out.println("[발신 시작]");

        for (int i = 1; i <= 3; i++) {
            String data = "메세지 : " + i;
            byte[] byteArr = data.getBytes(StandardCharsets.UTF_8);
            DatagramPacket packet = new DatagramPacket(
                    byteArr,
                    byteArr.length,
                    new InetSocketAddress("localhost",5001)
            );
            datagramSocket.send(packet);
            System.out.println("[보낸 바이트 수 : " + byteArr.length + "]");
        }
        datagramSocket.close();
    }
}
