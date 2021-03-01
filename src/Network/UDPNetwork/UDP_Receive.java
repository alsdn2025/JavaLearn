package Network.UDPNetwork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDP_Receive {
    public static void main(String[] args) throws SocketException, InterruptedException {
        DatagramSocket datagramSocket = new DatagramSocket(
                new InetSocketAddress("localhost",5001)
        );

        // 데이터 송/수신은 작업스레드에게 맡기는게 좋다.
        Thread thread = new Thread(() -> {
            System.out.println("[수신 시작]");
            try {
                while (true) {
                    DatagramPacket packet = new DatagramPacket(new byte[100], 100);

                    datagramSocket.receive(packet);
                    String data = new String(packet.getData(),0, packet.getLength());
                    System.out.println("[받은 내용 : " +
                            packet.getSocketAddress() + " : " + data);
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        });
        thread.start();

        Thread.sleep(10000);
        datagramSocket.close();
    }
}
