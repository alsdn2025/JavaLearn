package Network.InetAdd;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class e1_InetAddress {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("해당 컴퓨터의 IP 주소 : " + local.getHostAddress());
        InetAddress[] iaArr = InetAddress.getAllByName("www.youtube.com");

        System.out.println("www.youtube.com의 IP주소 ---");
        for(var ia : iaArr){
            System.out.println(ia.getHostAddress());
        }

        System.out.println("www.youtube.com의 첫번째 주소 : " +
                InetAddress.getByName("www.youtube.com").getHostAddress());


    }
}
