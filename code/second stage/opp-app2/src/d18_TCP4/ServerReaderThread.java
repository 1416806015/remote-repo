package d18_TCP4;

import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            // 包装成数据输入流
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                try {
                    String msg = dis.readUTF();
                    System.out.println(msg);
                    // 把这个消息分发给全部客户端进行接收
                    sendMsgToAll(msg);
                } catch (IOException e) {
                    System.out.println("有人下线了！！！" + socket.getRemoteSocketAddress());
                    Server.onlineSocket.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void sendMsgToAll(String msg) throws IOException {
        // 发送给全部在线的socket管道接收
        for (Socket onlineSocket : Server.onlineSocket) {
            // 把消息推给他，得到的是输出流
            OutputStream os = onlineSocket.getOutputStream();
            // 得到的输出流包装成一个数据输出流，来发消息比较方便
            DataOutputStream dos = new DataOutputStream(os);
            // 通过这个数据输出流为在线的socket推送信息
            dos.writeUTF(msg);
            dos.flush();

        }

    }
}
