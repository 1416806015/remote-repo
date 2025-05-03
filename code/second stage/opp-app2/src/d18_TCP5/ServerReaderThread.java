package d18_TCP5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //  立即响应一个网页内容：“chenchenchen123456”给浏览器展示
        // 响应是把内容写出去，所以是输出流
        try {
            OutputStream os = socket.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type:text/html;charset=UTF-8");
            ps.println();
            ps.println("<div style='color:red;fonr-size:120px;text-align:center'>chenchenchen123456</div>");
            ps.close();

            
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
