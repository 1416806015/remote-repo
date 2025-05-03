package d18_TCP4;
/**
 * TCP  实现多个客服端同时通信
 */

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> onlineSocket = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("------服务端启动成功--------");
        // 1、创建ServerSocket的对象，同时为服务端注册端口。
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            // 2、使用serverSocket对象，调用一个accept方法，等待客户端的连接请求
            Socket socket = serverSocket.accept();
            onlineSocket.add(socket);
            System.out.println("有人上线了！！！" + socket.getRemoteSocketAddress());
            // 3、把这个客服端对应的socket通信管道，交给一个独立的线程负责
            new ServerReaderThread(socket).start();
        }


    }
}
