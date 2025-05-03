package d18_TCP3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
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
                } catch (IOException e) {
                    System.out.println("有人下线了！！！" + socket.getRemoteSocketAddress());
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
