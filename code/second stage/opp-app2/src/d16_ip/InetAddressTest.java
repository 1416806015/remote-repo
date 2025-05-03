package d16_ip;

import java.net.InetAddress;

public class InetAddressTest {
    public static void main(String[] args) throws Exception {

        //1、获取本机IP地址对象的
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        //2、获取指定IP或者域名的IP地址对象。
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        System.out.println(ip2.isReachable(5000));
    }
}
