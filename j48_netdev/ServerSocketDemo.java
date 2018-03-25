package j48_netdev;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

//
public class ServerSocketDemo {
    public static void main(String [] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        System.out.println("等待客户端连接...");
        Socket client = server.accept(); //等待客户端连接,此方法在连接传入之前一直阻塞。
        PrintStream out = new PrintStream(client.getOutputStream()); //利用打印流输出
        out.println("Hello,world");
        System.out.println("断开连接");
        client.close();
        server.close();
    }
}
